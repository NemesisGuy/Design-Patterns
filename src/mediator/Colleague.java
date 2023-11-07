package mediator;

interface Colleague {
    void receive(String message);
    void send(String message);
}
