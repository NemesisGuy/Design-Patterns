package behavioralPatterns.mediator;

class ConcreteColleague1 implements Colleague {
    private Mediator mediator;

    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleague1 received: " + message);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }
}

