# Restaurant Management Project
This is a restaurant management application developed using Spring Boot.
_ _ _
# Framework Used
> [Spring Boot](https://spring.io/projects/spring-boot)
_ _ _ 
# Language Used
> [Java](https://docs.oracle.com/en/java/)
_ _ _
# Data Flow
* The client sends HTTP requests to the server.
* The requests are handled by the Controller class, which maps the requests to specific methods.
* The Controller methods invoke the corresponding methods in the Service class.
* The Service class interacts with the Repository class to perform CRUD operations on the data.
* The Repository class interacts with the database to fetch or modify data.
* The Service class returns the response to the Controller.
* The Controller returns the response back to the client.
_ _ _
# Project Structure
The project follows the following structure:

* src/main/java/com/geekster/Restaurant_Project/controller: Contains the RESTful API endpoints and request handlers.
* src/main/java/com/geekster/Restaurant_Project/model: Contains the model classes representing the entities in the application.
* src/main/java/com/geekster/Restaurant_Project/repository: Contains the repository classes responsible for database interactions.
* src/main/java/com/geekster/Restaurant_Project/service: Contains the service classes implementing the business logic.
* src/main/resources: Contains the application properties and configurations.
_ _ _ 
# Database Design
The application uses a database to store restaurant information. The database design includes the following tables:

Restaurant: Stores information about restaurants, including ID, name, address, specialty, total staff, and rating.
# Project Summary
The Restaurant Project is a Spring Boot-based application that provides RESTful APIs for managing restaurants. It allows users to perform CRUD operations on restaurant data, including adding new restaurants, retrieving all restaurants, retrieving a specific restaurant by ID, updating the specialty of a restaurant, and deleting a restaurant by ID.

The application uses a layered architecture with separate components for the Controller, Service, and Repository. It follows the MVC (Model-View-Controller) design pattern to ensure separation of concerns and maintainability of the codebase.

The project can be run locally using Spring Boot's embedded server or deployed to a cloud platform for production use.
