package org.chatapp.server;

import org.chatapp.server.model.ChatMessage;
import io.javalin.Javalin;
import io.javalin.websocket.WsContext;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ChatController {

    // Store WebSocket sessions
    private static Set<WsContext> connectedUsers = ConcurrentHashMap.newKeySet();

    public static void configure(Javalin app) {

        // Configure WebSocket endpoint
        app.ws("/chat", ws -> {

            // When a new user connects
            ws.onConnect(ctx -> {
                connectedUsers.add(ctx);
                System.out.println("A new user connected: " + ctx.sessionId()); // Use session.getId() here
            });

            // When a message is received
            ws.onMessage(ctx -> {
                ChatMessage message = new ChatMessage(ctx.message());
                broadcastMessage(message);
            });

            // When a user disconnects
            ws.onClose(ctx -> {
                connectedUsers.remove(ctx);
                System.out.println("A user disconnected: " + ctx.sessionId()); // Use session.getId() here
            });
        });
    }

    // Method to broadcast messages to all connected users
    private static void broadcastMessage(ChatMessage message) {
        for (WsContext user : connectedUsers) {
            user.send(message.getContent());
        }
    }
}
