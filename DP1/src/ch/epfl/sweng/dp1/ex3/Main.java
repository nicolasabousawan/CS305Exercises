package ch.epfl.sweng.dp1.ex3;

public class Main {
    public static void main(String[] args) {
        // Create two screens
        Screen screen = new Screen();
        Phone phone = new Phone();
        // Create a datastore
        DataStore dataStore = new DataStore();
        // Connect the dataStore and the screens

        // Update data in the dataStore
        String data = "Some data";
        dataStore.setData(data);
        dataStore.updateScreen(screen);
        dataStore.updatePhone(phone);

        data = "New data";
        dataStore.setData(data);
        dataStore.updateScreen(screen);
        dataStore.updatePhone(phone);
    }
}