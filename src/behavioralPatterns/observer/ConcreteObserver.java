package behavioralPatterns.observer;

class ConcreteObserver implements Observer {
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Updated behavioralPatterns.state: " + subject.getState());
    }
}
