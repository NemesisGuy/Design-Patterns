package visitor;

class ConcreteVisitor2 implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("ConcreteVisitor2 visiting ElementA");
        element.operationA();
    }

    @Override
    public void visit(ElementB element) {
        System.out.println("ConcreteVisitor2 visiting ElementB");
        element.operationB();
    }
}
