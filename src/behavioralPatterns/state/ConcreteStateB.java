package behavioralPatterns.state;

class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling behavioralPatterns.state B");
        context.setState(new ConcreteStateA());
    }
}