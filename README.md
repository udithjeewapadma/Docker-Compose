# Docker-Compose

This project demonstrates how to:

Develop a simple Spring Boot application with JPA/Hibernate and MySQL.
Package the app into a Docker container.
Set up MySQL 8 in Docker with a custom database (dockerize_db) and password (test123).
Use Docker Compose to orchestrate both the Spring Boot app and MySQL.
Automatically create tables (e.g. users) on startup.

✅ How to run

mvn clean package -DskipTests
docker-compose up --build

✅ Features

Spring Boot 3 + Java 17
MySQL 8 as database
JPA auto-creates schema
Docker + Docker Compose integration
