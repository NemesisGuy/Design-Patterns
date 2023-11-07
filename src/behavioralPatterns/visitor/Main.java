package behavioralPatterns.visitor;

public class Main {
    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();

        elementA.accept(visitor1);
        elementA.accept(visitor2);

        elementB.accept(visitor1);
        elementB.accept(visitor2);
    }
}