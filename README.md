# Library Management System

This is a simple Java application for managing a library's resources. It follows the principles of SOLID design to ensure code maintainability, scalability, and extensibility.

## SOLID Principles

### Single Responsibility Principle (SRP)
Each class in this application has a single responsibility. For example:
- `Book` class represents the attributes and behavior of a book.
- `Magazine` class represents the attributes and behavior of a book.
- `Author` class represents the attributes and behavior of a book.

### Open/Closed Principle (OCP)
The application is designed to be open for extension but closed for modification. New functionality can be added without altering existing code. For instance:
- You can easily perform sending message in Notification extending `NotificationService` class.

### Liskov Substitution Principle (LSP)
Subclasses can be substituted for their base classes without affecting the functionality of the program. For instance:
- `Book` and other resource types can be used interchangeably wherever `Publication` is expected.

### Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use. For example:
- `ConnectEmail` interface provides methods specific to email connection during sign in.
- `ConnectPhone` interface provides methods specific to phone number connection during sign in.

### Dependency Inversion Principle (DIP)
High-level modules should not depend on low-level modules. Both should depend on abstractions. In this application:
- Sharing is depend on `MagazineShare`, `BookShare` class depends on abstractions like `Author` and `Publisher`, rather than concrete implementations.

## Usage
1. Compile the source files using a Java compiler.
2. Run the compiled program.
3. Follow the on-screen instructions to interact with the library system.

## Contributors
- [Nuraskhan](https://github.com/nuraskhan)

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

