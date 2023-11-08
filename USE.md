# Design Patterns in Java

This repository contains examples of various design patterns implemented in Java. Design patterns are general reusable solutions to common problems encountered in software design. They represent best practices for designing and structuring code to achieve maintainability, flexibility, and scalability.

## Table of Contents

- [Creational Design Patterns](#creational-design-patterns)
- [Structural Design Patterns](#structural-design-patterns)
- [Behavioral Design Patterns](#behavioral-design-patterns)


______________

## Creational Design Patterns

Creational design patterns focus on object creation mechanisms, trying to create objects in a manner suitable to the situation. They help in making a system independent of the way its objects are created, composed, and represented, and the system is configured with a variety of objects.

...

## Structural Design Patterns

Structural design patterns deal with object composition, creating relationships between objects to form larger structures, and providing new functionality. They help define clear and useful relationships between different parts of a software system.

...

## Behavioral Design Patterns

Behavioral design patterns focus on communication between objects, how objects collaborate, and how they operate together to accomplish specific tasks.

...

## GitHub Repository

For a complete set of examples and code implementations, please visit [GitHub Repository](https://github.com/NemesisGuy).

## Wiki Documentation

Additional documentation and explanations for each design pattern can be found in the [Wiki](https://nemesis-wikijs.malicks.co.za/en/application-development-practice/notes), or my
[Google Doc](https://docs.google.com/document/d/14UeSj6s55VGrw4diJfQ3mi5gV1_VBIV1f-QU5x3arrg/edit?usp=sharing)

Feel free to explore the examples and learn how to apply these design patterns to improve the quality and maintainability of your code.


____________________

# Creational Design Patterns


Creational design patterns focus on object creation mechanisms, trying to create objects in a manner suitable to the situation. They help make a system independent of the way its objects are created, composed, and represented, and the system is configured with a variety of objects.

## Singleton Pattern

**Explanation:** The Singleton pattern ensures a class has only one instance throughout the application and provides a global point of access to that instance. It is achieved by restricting the instantiation of the class to a single instance.

**Use Case:** This pattern is useful in situations where you want to limit the number of instances of a class to just one, such as managing configurations or settings for an application, controlling access to a shared resource, or logging classes where you want a single point of entry to record logs.

## Factory Method Pattern

**Explanation:** The Factory Method pattern defines an interface for creating an object but leaves the choice of its type to its subclasses, creation being deferred to subclasses. It allows a class to delegate the responsibility of instantiating its objects to its subclasses.

**Use Case:** This pattern is used when a class can't anticipate the class of objects it must create or when a class wants its subclasses to specify the objects it creates. For example, GUI libraries that allow users to create different types of UI components or database connection factories that return different types of database connections.

## Abstract Factory Pattern

**Explanation:** The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. It defines an interface for creating a family of related or dependent objects without specifying their concrete classes.

**Use Case:** This pattern is useful when a system needs to be independent of how its objects are created, composed, and represented, and the system is configured with multiple families of objects. For example, GUI libraries that need to provide different themes (e.g., light mode and dark mode) or database connection factories that provide connections to different types of databases.

## Builder Pattern

**Explanation:** The Builder pattern separates the construction of a complex object from its representation, allowing the same construction process to create various representations. It involves a director class that orchestrates the construction process using different builders.

**Use Case:** This pattern is helpful when an object needs to be constructed with a large number of parameters, and some of them have default values. It also helps in scenarios where an object has a complex construction process, such as building a complex document with multiple sections, headers, footers, and content, or creating a complex meal in a restaurant with various courses, sides, and drinks.

## Prototype Pattern

**Explanation:** The Prototype pattern creates new objects by copying an existing object, known as the "prototype". It involves creating new objects by copying an existing object, known as the prototype.

**Use Case:** This pattern is useful when the cost of creating an object is more expensive than copying an existing object. It is also used when the object creation process is complex and can benefit from being initialized with an existing object, such as cloning objects in a game to create multiple instances of the same character with slight variations or copying a configuration object to create multiple instances with similar settings.


________

# Behavioral Design Patterns

Behavioral design patterns focus on communication between objects, how objects collaborate, and how they operate together to accomplish specific tasks.

## Chain of Responsibility Pattern

**Intent:** Pass a request along a chain of handlers. Upon receiving a request, each handler decides either to process it or to pass it to the next handler in the chain.

**Use Case:** When there are multiple handlers for a request, and the handler that processes the request depends on runtime conditions. It's useful when you want to decouple senders and receivers of a request.

## Command Pattern

**Intent:** Encapsulate a request as an object, thereby parameterizing clients with queues, requests, and operations. It allows for the parameterization of objects with commands and provides the ability to undo or redo operations.

**Use Case:** When you want to decouple the sender of a request from the object that processes the request. It's useful for implementing undo functionality, queuing requests, and providing an extensible way to handle operations.

## Interpreter Pattern

**Intent:** Given a language, define a grammar for it and provide an interpreter that interprets sentences in the language.

**Use Case:** When you want to define a language or grammar for specific problems and implement an interpreter to evaluate sentences in that language. It's useful for tasks involving parsing and interpreting expressions or languages.

## Iterator Pattern

**Intent:** Provide a way to access elements of an aggregate object sequentially without exposing its underlying representation.

**Use Case:** When you want to traverse a collection of objects without exposing the details of its internal representation. It's useful when you have different types of collections and want to provide a unified way to iterate over them.

## Mediator Pattern

**Intent:** Define an object that centralizes communication between objects in a system, promoting loose coupling between them.

**Use Case:** When you have a set of objects that need to communicate with each other, but you want to avoid direct dependencies between them. It's useful for managing complex interactions between objects.

## Memento Pattern

**Intent:** Capture an object's internal state without exposing its internal structure, allowing it to be restored to that state at a later time.

**Use Case:** When you want to provide the ability to undo or rollback to previous states of an object. It's useful for implementing features like "undo" in applications.

## Observer Pattern

**Intent:** Define a dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Use Case:** When you have a scenario where multiple objects need to be notified of changes in the state of another object. It's useful for implementing event handling systems.

## State Pattern

**Intent:** Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

**Use Case:** When an object's behavior needs to change dynamically based on its internal state. It's useful for implementing state machines and objects with varying behavior.

## Strategy Pattern

**Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable. The pattern allows the algorithm to vary independently from the context that uses it.

**Use Case:** When you want to select an algorithm's implementation at runtime or when you have multiple variations of an algorithm. It's useful for providing different strategies for solving a problem.

## Template Method Pattern

**Intent:** Define the skeleton of an algorithm in the superclass but let subclasses override specific steps of the algorithm without changing its structure.

**Use Case:** When you have an algorithm with a common structure but varying implementations for specific steps. It's useful for defining a blueprint for an algorithm and allowing subclasses to customize certain parts.

## Visitor Pattern

**Intent:** Represent an operation to be performed on the elements of an object structure. It lets you define a new operation without changing the classes of the elements on which it operates.

**Use Case:** When you have a complex object structure and you want to perform different operations on it without modifying the classes of the elements. It's useful for separating algorithms from the objects on which they operate.

____________________________________
# Structural Design Patterns

Structural design patterns deal with object composition, creating relationships between objects to form larger structures, and providing new functionality. They help define clear and useful relationships between different parts of a software system.

## Adapter Pattern

**Intent:** Convert the interface of a class into another interface that clients expect. It lets classes work together that couldn't otherwise because of incompatible interfaces.

**Use Case:** When you want to use an existing class that doesn't quite fit with the interface you need. It's like a translator between two incompatible systems.

## Bridge Pattern

**Intent:** Decouple an abstraction from its implementation so that both can vary independently.

**Use Case:** When you want to separate abstraction from implementation, allowing them to evolve independently. It's useful when you have multiple implementations of an interface.

## Composite Pattern

**Intent:** Compose objects into tree structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly.

**Use Case:** When you want clients to treat individual objects and compositions of objects uniformly. It's useful for representing hierarchies or structures where individual elements and compositions can be treated in the same way.

## Decorator Pattern

**Intent:** Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

**Use Case:** When you want to add new functionalities or behaviors to objects without altering their structure. It's useful when you have a base class and want to add optional features to it.

## Facade Pattern

**Intent:** Provide a unified interface to a set of interfaces in a subsystem. It defines a higher-level interface that makes the subsystem easier to use.

**Use Case:** When you want to provide a simplified and unified interface to a set of interfaces or classes in a subsystem. It's useful for hiding the complexity of the subsystem from clients.

## Flyweight Pattern

**Intent:** Minimize memory usage or computational expenses by sharing as much as possible with similar objects.

**Use Case:** When you have a large number of similar objects that can be shared to reduce memory consumption. It's useful in scenarios where memory usage is a critical concern.

## Proxy Pattern

**Intent:** Provide a surrogate or placeholder for another object to control access to it.

**Use Case:** When you want to add an additional level of control or functionality to an object without modifying its behavior directly. It's useful for scenarios like access control, caching, or lazy loading.
