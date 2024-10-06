package org.chatapp.server;

import io.javalin.Javalin;
import io.javalin.http.HttpStatus;

public class CustomErrorController {

    public static void configure(Javalin app) {
        // Handle 404 Not Found error
        app.error(HttpStatus.NOT_FOUND.getCode(), ctx -> {
            ctx.result("404 - Page Not Found!");
        });

        // Handle 500 Internal Server Error
        app.error(HttpStatus.INTERNAL_SERVER_ERROR.getCode(), ctx -> {
            ctx.result("500 - Internal Server Error!");
        });

        // General exception handling
        app.exception(Exception.class, (e, ctx) -> {
            ctx.status(HttpStatus.INTERNAL_SERVER_ERROR.getCode());
            ctx.result("An unexpected error occurred: " + e.getMessage());
        });
    }
}
