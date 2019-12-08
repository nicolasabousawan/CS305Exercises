package ex1;

public class DataStore {
    private String data;
    private ObserverTracker tracker;

    //crete a datastore with tracker set up
    public DataStore(ObserverTracker tracker){
        this.tracker = tracker;
    }

    //you call the tracker object when you want to add more observers
    public ObserverTracker getTracker() {
        return tracker;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        // Data has changed. Update the UI
    }

    protected void updatePhone(Phone phone) {
        phone.printToPhone(this.data);
    }

    protected void updateScreen(Screen screen) {
        screen.display(this.data);
    }

    //use this method to send the propagation
    public void sendUpdate(){
        tracker.notifyObservers(this.data);
    }
}