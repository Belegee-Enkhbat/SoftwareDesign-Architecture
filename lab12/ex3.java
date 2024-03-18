package lab12;

// Memento

import java.util.ArrayList;
import java.util.List;

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Originator
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

// Caretaker
class Caretaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}

public class ex3 {
    public static void main(String[] args) {
        // Create an Originator
        Originator originator = new Originator();

        // Create a Caretaker
        Caretaker caretaker = new Caretaker();

        // Set the state of the Originator and save it in the Memento
        originator.setState("State 1");
        caretaker.add(originator.saveStateToMemento());

        // Change the state of the Originator
        originator.setState("State 2");

        // Save the new state in the Memento
        caretaker.add(originator.saveStateToMemento());

        // Restore the state from the first Memento
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("State after restoring from Memento 1: " + originator.getState());

        // Restore the state from the second Memento
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("State after restoring from Memento 2: " + originator.getState());
    }
}
