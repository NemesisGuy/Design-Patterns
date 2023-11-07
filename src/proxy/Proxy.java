package proxy;
class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        // Perform some additional operations before forwarding the request
        System.out.println("Proxy: Performing pre-request operations");

        // Delegate the request to the real subject
        realSubject.request();

        // Perform some additional operations after the request is handled
        System.out.println("Proxy: Performing post-request operations");
    }
}
