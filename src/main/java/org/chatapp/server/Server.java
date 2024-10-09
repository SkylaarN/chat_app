package org.chatapp.server;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Server {

    private static final String PAGES_DIR = "/public/html";
    private static final int PORT = 8080;
    private final Javalin appServer;

    // Constructor to initialize the Javalin server with static file configuration
    public Server() {
        appServer = Javalin.create(config -> config.staticFiles.add(PAGES_DIR, Location.CLASSPATH));
        registerControllers();
    }

    // Main method to start the server on port 5050
    public static void main(String[] args) {
        Server server = new Server();
        server.start(PORT);
    }

    // Method to start the server on a specified port
    public void start(int port) {
        this.appServer.start(port);
    }

    // Method to stop the server
    public void stop() {
        this.appServer.stop();
    }

    // Method to get the current port the server is running on
    public int port() {
        return appServer.port();
    }

    //Method to register controllers
    private void registerControllers() {
        ChatController.configure(appServer);
        CustomErrorController.configure(appServer);
    }
}