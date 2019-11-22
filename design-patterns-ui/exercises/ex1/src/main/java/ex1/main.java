package ex1;

public class main {
    public static void main(String args[]){
        System.out.println("Hello");
        Pizza food = new PizzaBuilder("test1").setDough("white").setSauce("red").addTopping("anchovies").addTopping("chhese");
        System.out.println(food.toString() + "bob");
        Pizza food2 = new CheesePizza();
        System.out.println(food2.toString());
    }
}
