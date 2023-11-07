package behavioralPatterns.template;

/*
*
* The AbstractClass defines the behavioralPatterns.template method (templateMethod) that calls a series of steps.
* It also declares abstract methods (step1, step2, step3) that the subclasses must implement.

ConcreteClassA and ConcreteClassB are concrete subclasses that extend AbstractClass and provide specific implementations for the steps.

In the Main class, we create instances of ConcreteClassA and ConcreteClassB and execute the behavioralPatterns.template method for each of them.
* */
public class Main {
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        AbstractClass classB = new ConcreteClassB();

        System.out.println("Executing Template Method for ConcreteClassA:");
        classA.templateMethod();

        System.out.println("\nExecuting Template Method for ConcreteClassB:");
        classB.templateMethod();
    }
}
