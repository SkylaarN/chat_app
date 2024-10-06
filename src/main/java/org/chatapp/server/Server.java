package org.chatapp.server;

import io.javalin.Javalin;

public class Server {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public");
        }).start(8080); // Starts on port 8080

        // Configure WebSocket
        ChatController.configure(app);

        // Configure custom error handling
        CustomErrorController.configure(app);

        // Example route
        app.get("/", ctx -> ctx.result("Welcome to the chat application!"));
    }
}
