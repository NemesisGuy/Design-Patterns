package structuralPatterns.bridge;

/*
The Abstraction interface defines the high-level interface that clients interact with.

AbstractionImpl is a class that implements the Abstraction interface. It has a reference to an
Implementation object and delegates the operation call to it.

The Implementation interface defines the low-level interface that provides the actual implementation.

ConcreteImplementationA and ConcreteImplementationB are concrete implementation classes that implement the
Implementation interface.

In the Main class, we create instances of ConcreteImplementationA and ConcreteImplementationB, and then create Abstraction
objects that use these implementations. When we call operation on the abstractions, they delegate the call to their respective implementations.

The Bridge pattern is useful when you want to separate abstraction from implementation, allowing them to evolve independently.
It's particularly useful in cases where you have multiple variations of abstractions and implementations,
and you want to avoid a combinatorial explosion of classes. This pattern is commonly used in GUI libraries, device drivers
, and operating system kernels.
* */
public class Main {
    public static void main(String[] args) {
        Implementation implementationA = new ConcreteImplementationA();
        Implementation implementationB = new ConcreteImplementationB();

        Abstraction abstractionA = new AbstractionImpl(implementationA);
        abstractionA.operation();

        Abstraction abstractionB = new AbstractionImpl(implementationB);
        abstractionB.operation();
    }
}
