package mediator;
public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleagues(colleague1, colleague2);

        colleague1.send("Hello from Colleague1");
        colleague2.send("Hi from Colleague2");
    }
}

