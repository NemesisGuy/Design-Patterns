package creationalPatterns.prototype;
/*
* The Prototype interface declares a method (clone) for creating a copy of the object.

ConcretePrototype is a class that implements the Prototype interface.
* It contains a field (name) and overrides the clone method to create a new instance with the same behavioralPatterns.state.

In the Main class, we create an original object and clone it. We then modify the name of the cloned object to
* differentiate it from the original.

The Prototype pattern is useful when you need to create objects that are similar to existing ones,
* but you want to avoid the cost of creating them from scratch.
*
* It's especially beneficial when object creation is complex or resource-intensive.
* This pattern is often used in scenarios like object caching and when you want to customize instances of a class while
*  keeping the original intact.
*
* */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("Original Object");
        System.out.println("Original Object: " + prototype.getName());

        ConcretePrototype clonedObject = (ConcretePrototype) prototype.clone();
        clonedObject.setName("Cloned Object");
        System.out.println("Cloned Object: " + clonedObject.getName());
    }
}
