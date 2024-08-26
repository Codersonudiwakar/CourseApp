# CourseApp Project
## Prerequisites
Before you start, ensure you have the following installed on your machine:

Docker: Install Docker
Docker Compose: Install Docker Compose

## Run the Application
Use Docker Compose to start the application:
-- docker-compose up --build
## step 1-Create A folder
## step 2- copy docker-compose.yml in this folder and open with cmd
## step 3- docker-compose up --build 
now you can check
http://localhost:3000/

## Project Details
MySQL Database
Container Name: mysql-server
Version: 8.0.28
Database Name: CourseApp
Username: admin
Password: password
Port: 3307:3306
## Backend (Spring Boot)
Container Name: CourseApp-backend
Docker Hub Image: sonukumardiwakar/courseapp-backend:latest
Port: 8080:8080
## Frontend (React)
Container Name: course-app-frontend
Docker Hub Image: sonukumardiwakar/courseapp-frontend:latest
Port: 3000:80
## Customization
Changing Environment Variables
You can customize the environment variables for the backend or frontend by editing the docker-compose.yml file.
