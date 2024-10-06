package org.chatapp.server;

import io.javalin.Javalin;
import io.javalin.websocket.WsContext;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class WebSocketConfig {

    // Store connected clients
    private static Set<WsContext> connectedClients = ConcurrentHashMap.newKeySet();

    public static void configure(Javalin app) {

        // WebSocket configuration
        app.ws("/chat", ws -> {

            // When a client connects
            ws.onConnect(ctx -> {
                connectedClients.add(ctx);
                System.out.println("Connected: " + ctx.sessionId());
            });

            // When a client sends a message
            ws.onMessage(ctx -> {
                String message = ctx.message();

                // Broadcast message to all connected clients
                for (WsContext client : connectedClients) {
                    client.send(message);
                }
            });

            // When a client disconnects
            ws.onClose(ctx -> {
                connectedClients.remove(ctx);
                System.out.println("Disconnected: " + ctx.sessionId());
            });

            // On error
            ws.onError(ctx -> {
                System.out.println("Error: " + ctx.error());
            });
        });
    }
}
