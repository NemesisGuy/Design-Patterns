package behavioralPatterns.visitor;

class ElementA implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("ElementA operation");
    }
}


