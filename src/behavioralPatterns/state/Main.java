package behavioralPatterns.state;
/*The State interface defines a method (handle) that represents the behavior associated with a particular behavioralPatterns.state.

ConcreteStateA and ConcreteStateB are concrete behavioralPatterns.state classes that implement the State interface.
Each behavioralPatterns.state handles the context differently and transitions to a new behavioralPatterns.state.

The Context class maintains a reference to the current behavioralPatterns.state and provides methods to set the behavioralPatterns.state and trigger a request.

In the Main class, we create an instance of Context and make a series of requests. The context delegates the handling of requests to its current behavioralPatterns.state.
*/
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.request();
        context.request();
        context.request();
    }
}
