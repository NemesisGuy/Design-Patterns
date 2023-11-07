package creationalPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();

        productA1.operationA();
        productB1.operationB();

        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();

        productA2.operationA();
        productB2.operationB();
    }
}
/*
*
* In this example:

The AbstractFactory interface declares methods for creating abstract products (createProductA and createProductB).

AbstractProductA and AbstractProductB are abstract product interfaces that declare the operations for products of type A and B.

Concrete product classes (ConcreteProductA1, ConcreteProductA2, ConcreteProductB1, ConcreteProductB2) implement the corresponding abstract product interfaces.

ConcreteFactory1 and ConcreteFactory2 are concrete factories that implement the AbstractFactory interface. They create products of type A and B.

In the Main class, we create instances of ConcreteFactory1 and ConcreteFactory2, and use them to create products of type A and B. The products are then used to perform their respective operations.

The Abstract Factory pattern is useful when you want to ensure that the created objects are compatible and work together. It's often used in situations where you need to create families of related objects, such as UI components, database access methods, or system configurations.
*
* */