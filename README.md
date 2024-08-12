# YumCourt-Lombok

## Overview

YumCourt-Lombok is a specialized version of the YumCourt online food ordering system that emphasizes the use of Project Lombok to reduce boilerplate code. By leveraging Lombok annotations, the codebase becomes more concise, readable, and easier to maintain.

## Features

- **Boilerplate Reduction**: Use Lombok annotations to automatically generate getters, setters, constructors, and more.
- **Clean Codebase**: Less repetitive code makes the project easier to manage and extend.
- **Integration with YumCourt**: All features of the original YumCourt project are retained, including user management, menu browsing, order processing, and delivery management.

## Technologies Used

- **Java**: Core programming language
- **Spring Boot**: Framework for building backend services
- **JPA**: For database interactions and ORM
- **Lombok**: Reduces boilerplate code using annotations
- **Maven**: Build tool for dependency management
- **MySQL**: Relational database for persistent data storage

## Lombok Annotations Used

- **@Getter and @Setter**: Automatically generate getter and setter methods for class fields.
- **@ToString**: Generate a meaningful `toString()` method.
- **@EqualsAndHashCode**: Implement `equals()` and `hashCode()` methods.
- **@NoArgsConstructor, @RequiredArgsConstructor, @AllArgsConstructor**: Generate constructors with different parameter combinations.
- **@Data**: A shortcut for `@ToString`, `@EqualsAndHashCode`, `@Getter` on all fields, `@Setter` on all non-final fields, and `@RequiredArgsConstructor`.
- **@Builder**: Implement the Builder pattern for object creation.
- **@Slf4j**: Generate a logger instance for the class.

## Prerequisites

Before begin, ensure you have the following installed:

- **Java 11** or higher
- **Maven 3.6** or higher
- **MySQL 8.0** or higher (or another relational database)
- **Git** for version control
- **Lombok Plugin**: Installed in your IDE (e.g., IntelliJ IDEA or Eclipse)

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/OmkarJadhav98/yumcourt-lombok.git

2. **Navigate to the project directory**:
   ```bash
   cd yumcourt-lombok
   
3. **Build the project**:
   ```bash
   mvn clean install

4. **Run the application**:
   ```bash
   mvn spring-boot:run

5. **Access the application**:
- Open your browser and visit http://localhost:8080 to start using YumCourt-Lombok.

## Usage
-This project showcases how to use Lombok annotations to streamline Java code. For example, the `Address` class:
   ```java
   package com.yumcourt.model;
   
   import lombok.*;
   
   @Getter
   @Setter
   @ToString
   @AllArgsConstructor
   @NoArgsConstructor
   
   public class Address {
       private long id;
       private String name;
       private long flatNo;
       private String buildingName;
       private String street;
       private String city;
       private long pinCode;
       private String state;
   
   }
   ```

## Known Issues
- Lombok annotations require IDE support, so ensure that the Lombok plugin is installed and annotation processing is enabled in your IDE.
- Currently, the project only supports MySQL as the database.

## Contributing
-  Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## Contact
For questions or support, please contact `objadhav28@gmail.com`.
   ```bash
   This README.md file is tailored for the YumCourt-Lombok project, highlighting the use of Lombok and providing all necessary setup instructions.
