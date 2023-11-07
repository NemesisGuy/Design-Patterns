package behavioralPatterns.mediator;

interface Mediator {
    void send(String message, Colleague colleague);
}
