# UC1 – Application Startup (Welcome Page)

## Goal
Establish a clear and predictable starting point for the Hotel Booking application by demonstrating how a Java program begins execution and produces console output.

## Actor
User – runs the application from the command line or an IDE.

## Flow
1. The user runs the application.
2. The JVM invokes the `main()` method.
3. The application prints a welcome message along with the application name and version.
4. The application terminates.

## Key Concepts Used

### Class
A Java program must be defined inside a class.  
The class acts as the container for the application logic.

### main() Method
The `main()` method is the entry point of the Java application.

Signature:
```java
public static void main(String[] args)
