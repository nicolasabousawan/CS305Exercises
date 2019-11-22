package ex1;

public class PizzaBuilder extends Pizza{
    public PizzaBuilder(String name){
        this.name = name;
    }
    public PizzaBuilder addTopping(String food){
        toppings.add(food);
        return this;
    }
    public PizzaBuilder setSauce(String sauce){
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder setDough(String dough){
        this.dough= dough;
        return this;
    }

}

