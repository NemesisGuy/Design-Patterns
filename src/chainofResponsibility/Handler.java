package chainofResponsibility;

interface Handler {
    void handleRequest(Request request);

    void setNextHandler(Handler handler2);
}
