# Authentication and Authorization Service

This is a modular backend service for **authentication** and **authorization** using **Spring Boot** and **JWT (JSON Web Tokens)**. The service includes role-based access control (RBAC) and supports secure authentication for different types of users. 

## Features

- User Registration and Login
- Password Encryption (BCrypt)
- JWT-based Authentication
- Role-Based Access Control (Admin, User, etc.)
- Refresh Token Support
- Token Blacklisting for Logout
- Custom Error Handling and Response
- User Management API

## Technologies Used

- **Spring Boot** - Backend Framework
- **Spring Security** - For authentication and authorization
- **JWT (JSON Web Tokens)** - Token-based authentication
- **MySQL/MariaDB** - Database (can be swapped as needed)
- **BCrypt** - Password encryption
- **Lombok** - Reduce boilerplate code
- **Maven** - Build tool

## Architecture

- **Controller**: Handles HTTP requests (login, register, etc.).
- **Service**: Contains business logic for user authentication, authorization, and token management.
- **Repository**: Interfaces for database interaction.
- **SecurityConfig**: Configures JWT security, role management, and filters.



