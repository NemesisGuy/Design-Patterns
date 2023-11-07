package structuralPatterns.adapter;

class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("ConcreteAdaptee: Handling specific request");
    }
}
