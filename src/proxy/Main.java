package proxy;

public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);

        // Accessing through the proxy
        proxy.request();
    }
}
