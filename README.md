# BookMyStayApp

## Overview
**BookMyStayApp** is a Hotel Booking Management System designed to demonstrate the practical application of **Core Java** and **fundamental data structures** in real-world software systems.

The project is built incrementally using multiple **use cases**, where each use case introduces a specific programming concept. These concepts address common software engineering challenges such as:

- Fair request handling  
- Inventory consistency  
- Prevention of double-booking  

The focus of the project is on **core logic and system behavior**, rather than user interface development. This approach allows learners to understand not only **how data structures are used**, but also **why they are essential** for building scalable and maintainable software systems.

---

# Use Case 1: Application Entry & Welcome Message

## Goal
Establish a clear and predictable starting point for the Hotel Booking application by demonstrating how a Java program begins execution and produces console output.

## Actor
**User** – runs the application from the command line or an IDE.

## Flow
1. The user runs the application.
2. The **Java Virtual Machine (JVM)** invokes the `main()` method.
3. The application prints a welcome message along with the **application name and version**.
4. The application terminates.

---

## Key Concepts Used

### Class
Even the simplest Java application must be defined inside a **class**.  
The class acts as a container for application behavior and marks the logical boundary of the program.

### main() Method
The `main()` method is the **entry point** of every standalone Java application.  
The JVM looks specifically for the method signature:

```java
public static void main(String[] args)
```

### static Keyword
The `main()` method is declared `static` so it can be executed **without creating an object** of the class. This allows the JVM to start program execution directly.

### Console Output
`System.out.println()` is used to send text output to the console.  
This is the simplest way to observe program behavior during early development.

### String Literals
Text enclosed in double quotes such as:

```
"Hotel Booking System v1.0"
```

is treated as a **String literal**, which is immutable and stored in the **String Pool**.

### Method Invocation
Calling `println()` on the `out` object demonstrates how **methods are invoked on objects** in Java.

### Application Flow
Execution proceeds **top to bottom inside the `main()` method** unless altered by control structures.  
This reinforces the concept of **linear program execution**.

### JavaDoc Comments
JavaDoc comments are used to **document classes and methods**. They form the foundation for professional code documentation.

### JavaDoc Annotations
Tags such as:

```
@author
@version
```

provide metadata about the class and help maintain traceability as the system evolves.

---

## Key Requirements
- Create a Java class that represents the **application entry point**.
- Implement the `main()` method using the **correct signature**.
- Print a **welcome message** to the console.
- Display the **application name and version information**.
- Use **JavaDoc comments** to document the class and its purpose.
- Ensure the program executes and **terminates without errors**.

---

## Key Benefits
- Clear and predictable **application startup behavior**
- Single, well-defined **execution entry point**
- Improved **debuggability during early development**

---

# Use Case 2: Basic Room Types & Static Availability

## Goal
Introduce **object-oriented modeling** through **inheritance and abstraction** before introducing data structures. This allows learners to focus on **domain design** rather than optimization.

---

## Actor
**User** – runs the application to view predefined room types and their availability.

---

## Flow
1. The user runs the application.
2. Room objects representing **different room types** are created.
3. Availability for each room type is stored using **simple variables**.
4. Room details and availability information are **printed to the console**.
5. The application terminates.

---

## Key Concepts Used

### Abstract Class
An **abstract class** represents a generalized concept that should **not be instantiated directly**.

The `Room` class defines:
- common attributes
- shared behavior

while enforcing a **consistent structure** for all room types.

---

### Inheritance
Concrete room classes such as:

- `SingleRoom`
- `DoubleRoom`
- `SuiteRoom`

extend the abstract `Room` class.

This allows shared properties to be **reused** while enabling **specialization** for each room type.

---

### Polymorphism
Room objects are referenced using the **Room type**, allowing the system to handle different room implementations uniformly.

This prepares the system for **future extensibility** without modifying client code.

---

### Encapsulation
Room attributes such as:

- number of beds
- room size
- price

are encapsulated inside the `Room` class.

This ensures that room characteristics are **controlled and modified only through defined behavior**.

---

### Static Availability Representation
Room availability is stored using **simple variables instead of data structures**.

This intentionally demonstrates the **limitations of hardcoded state management**, preparing the system for later refactoring.

---

### Separation of Domain and State
The system separates:

**Domain Objects**
- Represent **what a room is**

**State Variables**
- Represent the **current system availability**

This distinction becomes critical when **inventory management and data structures** are introduced later.

---

## Key Requirements
- Define an **abstract `Room` class** with common attributes.
- Create concrete room classes:
  - `SingleRoom`
  - `DoubleRoom`
  - `SuiteRoom`
- Initialize room objects in the **application entry point**.
- Store availability using **individual variables**.
- Display room details and availability in the **console output**.

---

## Key Benefits
- Clear introduction to **object-oriented domain modeling**
- Demonstrates **inheritance and abstraction** in a real-world context
- Establishes a strong **foundation for future inventory refactoring**

---

## Drawbacks of Previous Use Case
**Use Case 1** focused only on:

- Application startup
- Execution flow

It did not introduce **domain modeling or business concepts**, limiting the realism of the system.
