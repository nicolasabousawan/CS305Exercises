package ex7;

public abstract class Beverage {
    // Make a decorate interface that extends the object you want to put the decor on
    // You take the object you want to decorate and put inside the decorate object as a global variable
    // you constructor: use the super or simply assign it to the global variable
    // all other methods can use the methods available to the global variable and you can "decorate it"

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
