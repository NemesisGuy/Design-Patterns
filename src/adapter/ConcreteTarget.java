package adapter;

class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget: Handling request");
    }
}
