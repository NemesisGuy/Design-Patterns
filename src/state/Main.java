package state;
/*The State interface defines a method (handle) that represents the behavior associated with a particular state.

ConcreteStateA and ConcreteStateB are concrete state classes that implement the State interface.
Each state handles the context differently and transitions to a new state.

The Context class maintains a reference to the current state and provides methods to set the state and trigger a request.

In the Main class, we create an instance of Context and make a series of requests. The context delegates the handling of requests to its current state.
*/
public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.request();
        context.request();
        context.request();
    }
}
