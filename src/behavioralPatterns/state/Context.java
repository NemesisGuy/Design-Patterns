package behavioralPatterns.state;

class Context {
    private State currentState;

    public Context() {
        currentState = new ConcreteStateA();
    }

    public void setState(State state) {
        currentState = state;
    }

    public void request() {
        currentState.handle(this);
    }
}
