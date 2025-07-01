# Docker-Compose

A simple example project demonstrating how to dockerize a Spring Boot application with MySQL using Docker Compose.

---

## Features

- Spring Boot 3 with Java 17
- MySQL 8 as the database
- JPA/Hibernate for ORM and auto table creation
- Docker containerization of both Spring Boot app and MySQL
- Docker Compose to orchestrate containers

---

## Prerequisites

- Java 17 installed
- Maven installed
- Docker & Docker Compose installed

---

## Setup and Run

   ```bash
   mvn clean package -DskipTests
   docker-compose up --build


