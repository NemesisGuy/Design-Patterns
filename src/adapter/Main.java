package adapter;

public class Main {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Adaptee adaptee = new ConcreteAdaptee();
        Target adaptedTarget = new Adapter(adaptee);
        adaptedTarget.request();
    }
}
