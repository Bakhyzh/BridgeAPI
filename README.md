# BridgeAPI — External API Aggregation Service 

BridgeAPI is a backend service built with Java and Spring Boot that aggregates data from multiple external APIs into a single unified response.

The project focuses on reliability, scalability, and clean architecture for handling unstable third-party services in real-world environments.

----

## Features

- Aggregate multiple external APIs into one response
- Retry mechanism for failed external requests
- Fallback handling for unstable services
- Clean and scalable service architecture
- RESTful API design
- Global exception handling
- Data validation
- Docker support
- PostgreSQL integration

----

## Tech Stack

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker
- Maven

----

## Architecture

```text
Client
   ↓
REST Controller
   ↓
Service Layer
   ↓
External API Clients
   ↓
Multiple Third-Party APIs.
