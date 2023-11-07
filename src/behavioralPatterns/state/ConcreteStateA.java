package behavioralPatterns.state;

class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling behavioralPatterns.state A");
        context.setState(new ConcreteStateB());
    }
}
