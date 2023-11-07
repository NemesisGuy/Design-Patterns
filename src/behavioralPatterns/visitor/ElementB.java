package behavioralPatterns.visitor;

class ElementB implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("ElementB operation");
    }
}