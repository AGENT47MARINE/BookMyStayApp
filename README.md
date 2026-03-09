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
The `main()` method is declared `static` so that it can be executed **without creating an object** of the class. This allows the JVM to start execution directly.

### Console Output
`System.out.println()` is used to send text output to the console.  
This is the simplest way to observe program behavior during early development.

### String Literals
Text enclosed in double quotes such as:

```
"Hotel Booking System v1.0"
```

is treated as a **String literal**, which is immutable and stored in the **String pool**.

### Method Invocation
Calling `println()` on the `out` object demonstrates how **methods are invoked on objects** in Java.

### Application Flow
Execution proceeds **top to bottom inside the `main()` method** unless altered by control structures. This use case reinforces **linear execution flow**.

### JavaDoc Comments
JavaDoc comments are used to **document classes and methods** and serve as the foundation for professional code documentation.

### JavaDoc Annotations
Tags such as:

```
@author
@version
```

provide metadata about the class and help maintain traceability as the system evolves.

---

## Key Requirements
- Create a Java class that represents the **application entry point**
- Implement the `main()` method using the **correct signature**
- Print a **welcome message** to the console
- Display the **application name and version information**
- Use **JavaDoc comments** to document the class and its intent
- Ensure the program executes and **terminates without errors**

---

## Key Benefits
- Clear and predictable **application startup behavior**
- Single, well-defined **execution entry point**
- Improved **debuggability during early development**

---

# Use Case 2: Basic Room Types & Static Availability

## Goal
Introduce **object-oriented modeling** through **inheritance and abstraction** before introducing data structures. This allows students to focus on **domain design rather than optimization**.

---

## Actor
**User** – runs the application to view predefined room types and their availability.

---

## Flow
1. The user runs the application.
2. Room objects representing different **room types** are created.
3. Availability for each room type is stored using **simple variables**.
4. Room details and availability information are **printed to the console**.
5. The application terminates.

---

## Key Concepts Used

### Abstract Class
An **abstract class** is used to represent a generalized concept that should **not be instantiated directly**.  
The `Room` class defines common attributes and behavior shared by all room types while enforcing a consistent structure.

### Inheritance
Concrete room classes such as:

- `SingleRoom`
- `DoubleRoom`
- `SuiteRoom`

extend the abstract `Room` class. This allows shared properties to be reused while enabling specialization for each room type.

### Polymorphism
Room objects are referenced using the **Room type**, enabling uniform handling of different room implementations. This prepares the system for **future extensibility without changing client code**.

### Encapsulation
Room attributes such as:

- number of beds  
- size  
- price  

are encapsulated within the `Room` class. This ensures that room characteristics are **controlled and modified only through defined behavior**.

### Static Availability Representation
Room availability is stored using **simple variables instead of data structures**. This intentionally highlights the **limitations of hardcoded and scattered state management**.

### Separation of Domain and State
Room objects represent **what a room is**, while availability variables represent the **current system state**. This distinction becomes critical when inventory management is introduced later.

---

## Key Requirements
- Define an **abstract `Room` class** with common attributes
- Create concrete room classes:
  - `SingleRoom`
  - `DoubleRoom`
  - `SuiteRoom`
- Initialize room objects in the **application entry point**
- Store room availability using **individual variables**
- Display room details and availability in the **console**

---

## Key Benefits
- Clear introduction to **object-oriented domain modeling**
- Demonstrates **inheritance and abstraction** in a real-world context
- Establishes a strong **foundation for later inventory refactoring**

---

## Drawbacks of Previous Use Case
**Use Case 1** focused only on:

- Application startup
- Execution flow

No domain modeling or business concepts were introduced, limiting system realism.

---

# Use Case 3: Centralized Room Inventory Management

## Goal
Introduce **centralized inventory management** by replacing scattered availability variables with a single consistent data structure. This demonstrates how **HashMap** solves real-world state management problems.

---

## Actor
**RoomInventory** – responsible for managing and exposing room availability across the system.

---

## Flow
1. The system initializes the inventory component.
2. Room types are registered with their available counts.
3. Availability is stored and retrieved from a centralized **HashMap**.
4. Updates to availability are performed through **controlled methods**.
5. The current inventory state is displayed when requested.

---

## Key Concepts Used

### Problem of Scattered State
In the previous use case, availability was stored in **separate variables**. This leads to:

- inconsistent updates
- duplication
- poor scalability

as the system grows.

### HashMap
`HashMap<String, Integer>` is used to map **room types to available room counts**.  
This allows fast access, updates, and lookups based on a logical key.

### O(1) Lookup
HashMap provides **average constant-time complexity** for `get` and `put` operations. This makes it ideal for systems that require frequent availability checks.

### Single Source of Truth
All availability data is maintained in **one centralized structure**. This eliminates discrepancies caused by multiple variables representing the same state.

### Encapsulation of Inventory Logic
Inventory-related operations are encapsulated inside a **dedicated class**. Other parts of the system interact with inventory only through exposed methods, reducing system coupling.

### Separation of Concerns
Inventory manages **how many rooms are available**, not **what a room is**. Room characteristics such as price and size remain part of the **Room domain model**.

### Scalability
Adding a new room type requires only inserting a **new entry into the map**. No changes are required in application logic, demonstrating scalable design.

---

## Key Requirements
- Initialize room availability using a **constructor**
- Store room availability using a **HashMap**
- Provide methods to **retrieve current availability**
- Support **controlled updates** to room availability
- Ensure inventory state remains **consistent across operations**

---

## Key Benefits
- Single **source of truth** for room availability
- **Constant-time** inventory access and updates
- Improved **scalability** when introducing new room types

---

## Drawbacks of Previous Use Case
Availability was managed using **independent variables**.

This approach does **not scale** and increases the risk of **inconsistent system state** as the application grows.
