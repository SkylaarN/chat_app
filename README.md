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
