package behavioralPatterns.chainofResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNextHandler(handler2);

        Request request1 = new Request("This is a request for handler1");
        Request request2 = new Request("This is a request for handler2");
        Request request3 = new Request("This is a request for neither handler");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}