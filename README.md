## Web Chat Application ###

This is a collaborative web chat application built using vanilla Java, JavaScript, HTML, and CSS, with HTTP as the communication protocol. The project follows a layered architecture, with the frontend and backend cleanly separated for easier development and collaboration. It uses SQL for database management and is containerized using Docker for ease of deployment. 

## The project is organized into the following key sections:
```
/web-chat-app
├── /src
│   └── /main
│       ├── /java
│       │   └── /chatapp
│       │       ├── /server               # Server-side logic and WebSocket setup
│       │       ├── /httpapi              # HTTP API endpoints (REST controllers)
│       │       ├── /dbcontrollers        # CRUD operations (database interaction)
│       │       └── /logic                # Business logic and views
│       │      
│       └── /unittests                    # Unit tests
│           ├── /server                   # Unit tests for server-related code
│           ├── /api                      # Unit tests for HTTP API controllers
│           ├── /db                       # Unit tests for database controllers
│           └── /logic                    # Unit tests for business logic
│
├── /resources
│   ├── /html                             # HTML templates for the frontend
│   ├── /css                              # Stylesheets for the frontend
│   ├── /js                               # JavaScript files for frontend interactivity
│   └── /sql                              # Database schemas and migration scripts
│
├── /scripts                              # Utility scripts (build, deploy, etc.)
│
└── pom.xml                                # Maven configuration file
```
### Layered Architecture
### Client Side (Frontend)

The frontend is built using plain HTML, CSS, and JavaScript. It serves as the interface for users to interact with the chat application.

  * HTML: Provides the structure for the web pages.
  * CSS: Ensures the web pages are styled and responsive.
  * JavaScript: Manages frontend interactivity and handles communication with the backend via HTTP requests.

### Domain Logic (Backend)

The backend is written in vanilla Java and communicates with the frontend through HTTP. No frameworks are used, keeping the project lightweight and simple.

  * Server: Manages HTTP requests and responses, serving as the bridge between clients and the domain logic.

  * HTTP API: Exposes RESTful endpoints that allow the frontend to perform CRUD operations and interact with the chat server.

  * DB Controllers: Handles all SQL queries and database interactions. Simple SQL scripts are used for managing users, messages, and chat rooms.

  * Logic: Contains the core business logic, which processes and validates data, manages user interactions, and ensures smooth communication between components.

### Testing Layer

Unit tests are provided to verify the core functionality of each layer:

  * Server Tests: Test the HTTP request handling and server functionality.
  * API Tests: Ensure the correctness of the HTTP API endpoints.
  * Database Tests: Validate database CRUD operations and data integrity.
  * Logic Tests: Test business logic, including input validation and message handling.

### Features

  * HTTP-Based Communication: All communication between the client and server is done via HTTP requests.
  * RESTful API: Exposes API endpoints for performing chat-related operations such as sending messages and retrieving user data.
  * SQL for Data Storage: SQL scripts are used for creating and managing the database schema.
  * Dockerized Application: The project is set up to run within Docker containers, making it easier to run and collaborate on across different environments.

### Getting Started
Prerequisites

  * Java 17 or higher (JDK 17+)
  * Docker
  * Any SQL-compliant database (you will use plain SQL scripts)

Installation

  Clone the repository:


    git clone git@github.com:SkylaarN/chat_app.git

  Navigate to the project directory:

    cd web-chat-app

  Build the project using Maven:

    mvn clean install


  Running with Docker

    Build the Docker image:
