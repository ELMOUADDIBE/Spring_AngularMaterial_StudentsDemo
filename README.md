# Simple Student Management System

This project is a simple management system for students and payments, utilizing Java Persistence API (JPA) and Hibernate with Spring Boot for the backend, and Angular for the frontend.

## Getting Started

To get started with this project, first clone the repository using Git:

```bash
git clone https://github.com/ELMOUADDIBE/Spring_AngularMaterial_StudentsDemo.git
````
## Features

- **Backend**: Built with Spring Boot.
- **Frontend**: Developed using Angular.
- **Database**: Utilizes the H2 in-memory database for ease of testing.
- **API Testing**: Incorporates Swagger UI.

## Backend Setup

The backend is developed using Spring Boot. Below are the details on the dependencies and how to access the testing utilities:

### Dependencies

Add the following dependency to your `pom.xml` to utilize SpringDoc's OpenAPI for Swagger UI integration:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
```
## Testing the API
- **Swagger UI URL**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Frontend Setup
The frontend is developed using Angular. Below are the instructions for setting up and running the frontend.

### Creating the Frontend
Run the following commands to create and setup Angular with Angular Material:

````
ng new frontend-ang --directory=./ --no-standalone
ng add @angular/material
````

### Launching the Frontend
To launch the Angular frontend application, use:
```
ng serve
````
