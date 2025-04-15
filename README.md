# CURD_Assingment
🛠️#Employee Management System (CRUD)


📌 Project Overview
This project is a simple Employee Management System developed using Spring Boot and Hibernate (JPA), designed to perform basic CRUD operations (Create, Read, Update, Delete) on employee records. It serves as a foundational application for understanding how to integrate Java, Spring Framework, and database interactions using JPA and Hibernate ORM.

This assignment was developed as part of a Java course to demonstrate the fundamental structure of a full-stack Java backend application using RESTful architecture.

🔧 Technologies Used
Backend: Java, Spring Boot, Spring MVC, Spring Data JPA (Hibernate)

Database: MySQL

Tools: IntelliJ IDEA / Eclipse, Postman, Git, GitHub, MySQL Workbench

Build Tool: Maven

🎯 Core Features
Create a new employee

View all employee details

Update existing employee information

Delete employee records

Connect with MySQL database using JPA

Use RESTful APIs to handle requests

🛠️ How We Built It
1. Database Setup
Created a MySQL database named employee_db

Designed a single employee table with fields like id, name, email, designation, and salary

2. Spring Boot Setup
Initialized the project using Spring Initializr with dependencies:

Spring Web

Spring Data JPA

MySQL Driver

3. Entity and Repository
Created an Employee entity class with proper Hibernate annotations

Created a JpaRepository interface for CRUD operations

4. Service and Controller
Built a service layer to handle business logic

Developed REST controllers to expose endpoints like:

GET /employees

POST /employees

PUT /employees/{id}

DELETE /employees/{id}

5. Testing
Tested all API endpoints using Postman

Handled exceptions like employee not found or invalid input

 Folder Structure 
src/
 └── main/
     ├── java/
     │   └── com.crud/
     │       ├── controller/
     │       ├── model/
     │       ├── repository/
     │       ├── service/
     │       └── CrudApplication.java
     └── resources/
         ├── application.properties
