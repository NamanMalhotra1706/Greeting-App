# Greeting App - Spring Boot CRUD Project

This is a basic Spring Boot project to perform CRUD operations on a Greeting object using REST APIs.  
We used H2 in-memory database for storing data.

---

## Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

---

## Project Structure
- `Controller` - handles HTTP requests
- `Service` - contains business logic
- `Repository` - interacts with the database
- `Model (Entity)` - represents data structure

## API

## API Endpoints

| Method | URL                       | Description         |
|--------|---------------------------|---------------------|
| POST   | /greetings/add            | Add new greeting    |
| GET    | /greetings/all            | Get all greetings   |
| GET    | /greetings/{id}           | Get greeting by ID  |
| PUT    | /greetings/update/{id}    | Update greeting     |
| DELETE | /greetings/delete/{id}    | Delete greeting     |

## Request Example (POST or PUT)

```text
"Hello World" --> pass as raw text

