package ex1;

import java.util.ArrayList;

public class ObserverTracker {
    ArrayList<Observer> tracker = new ArrayList<>();

    void add(Observer o){
        tracker.add(o);
    }

    void remove(Observer o){
        tracker.remove(o);
    }

    void notifyObservers(String data){
        for(Observer o : tracker){
            o.printData(data);
        }
    }
}
/*
This object is a array that holds alls screens and phones in an array
The dataStore class will call this object to call all observers
 */