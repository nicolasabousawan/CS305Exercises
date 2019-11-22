/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ex1;

public class App {
    public static void main(String[] args) {
        // Create a screen and a phone
        Screen screen = new Screen();
        Phone phone = new Phone();
        // Create a datastore
        DataStore dataStore = new DataStore();
        // Connect the dataStore, phone and screen
        dataStore.registerObserver(screen);
        dataStore.registerObserver(phone);
        // Update data in the dataStore
        String data = "Some data";
        dataStore.setData(data);

        dataStore.removeObserver(screen);
        data = "New data";
        dataStore.setData(data);
    }
}
