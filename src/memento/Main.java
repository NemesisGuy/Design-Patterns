package memento;
/*The Memento class represents the state of the Originator.

The Originator class has an internal state that can be saved to a memento and restored from a memento. It also has a
printState method to display the current state.

The Caretaker class keeps track of the mementos.

In the Main class, we create an Originator and a Caretaker. We set different states for the originator, save mementos,
and then restore a previous state from a memento.

The Memento pattern is useful when you need to capture and restore an object's state,
especially in scenarios like undo functionality, versioning systems, and maintaining a history of states in applications.
*/


public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        originator.printState();
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 2");
        originator.printState();
        caretaker.addMemento(originator.saveStateToMemento());

        originator.setState("State 3");
        originator.printState();
        caretaker.addMemento(originator.saveStateToMemento());

        Memento memento = caretaker.getMemento(1);
        originator.getStateFromMemento(memento);
        originator.printState();
    }
}
