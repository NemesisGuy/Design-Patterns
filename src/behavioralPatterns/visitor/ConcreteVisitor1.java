package behavioralPatterns.visitor;

class ConcreteVisitor1 implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("ConcreteVisitor1 visiting ElementA");
        element.operationA();
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("ConcreteVisitor1 visiting ElementB");
        element.operationB();
    }
}

