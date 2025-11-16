# Spring Boot Event Management API

### 🚀 **Developer's Note** 🚀
> This entire RESTful API project was conceptualized, built, and tested in **2 hours** as part of a module-end exam, demonstrating rapid development and strong fundamentals in the Spring Boot ecosystem.

## Project Summary

This is a Spring Boot RESTful web service for managing "Events." It provides complete C-R-D (Create, Read, Delete) functionality for event records, built on a robust and modern Java stack.

The application uses Spring Data JPA for database operations, DTOs for clean data transfer, and a global exception handler to ensure clean API responses.

## Key Features

* **Add New Events:** Create and save new events to the database.
* **Retrieve All Events:** Get a complete list of all available events.
* **Retrieve Specific Events:**
    * Get a single event by its unique ID.
    * Get a list of events by their location.
* **Delete Events:** Remove an event by its ID.
* **Global Exception Handling:** Implements `@RestControllerAdvice` to gracefully handle errors like `ResourceNotFoundException` and return a standardized JSON response.
* **DTO Pattern:** Uses an `EventDTO` for validating incoming requests and decoupling the API layer from the database (entity) layer.
* **Database Integration:** Connects to a MySQL database using Spring Data JPA and the `EventRepository` interface.

## Tech Stack

* **Framework:** Spring Boot
* **Language:** Java 21
* **Database:** Spring Data JPA with MySQL
* **API:** Spring Web (RESTful controllers)
* **Tools:**
    * Lombok (for clean model code)
    * ModelMapper (for DTO-to-Entity conversion)
    * Maven (for dependency management)
* **Validation:** Jakarta Bean Validation (using annotations like `@NotBlank` in the DTO)

## How to Run This Project

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/RishiDusane/spring-boot-event-api.git](https://github.com/RishiDusane/spring-boot-event-api.git)
    cd spring-boot-event-api
    ```

2.  **Configure the Database:**
    * Open `src/main/resources/application.properties`.
    * Update the `spring.datasource.url`, `spring.datasource.username`, and `spring.datasource.password` to match your local MySQL setup.
    * The application is set to `spring.jpa.hibernate.ddl-auto=update`, so it will create the `Event` table for you in your database.

3.  **Run the application:**
    You can run the application using the Maven wrapper:
    ```bash
    ./mvnw spring-boot:run
    ```
    Or, you can run the `main` method in the `Application.java` file from your IDE.

## API Endpoints

Here are the primary endpoints you can test using a tool like Postman:

### `POST /addEvent`

* **Description:** Adds a new event.
* **Body (JSON):**
    ```json
    {
      "eventName": "Spring Dev Conference",
      "organizerName": "TechCorp",
      "categoryName": "CONFERENCE",
      "location": "New York",
      "city": "New York",
      "date": "2025-12-01",
      "ticketPrice": 150.00
    }
    ```

### `GET /getAllEvents`

* **Description:** Retrieves a list of all events.

### `GET /events/{eventId}`

* **Description:** Retrieves a single event by its ID.
* **Example:** `GET /events/1`

### `GET /events/location/{location}`

* **Description:** Retrieves all events in a specific location.
* **Example:** `GET /events/location/New York`

### `DELETE /deleteEvent/{eventId}`

* **Description:** Deletes an event by its ID.
* **Example:** `DELETE /deleteEvent/1`
