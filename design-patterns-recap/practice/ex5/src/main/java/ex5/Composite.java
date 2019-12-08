package ex5;


import java.util.ArrayList;

/*
Understanding the herarchy might be a little confusing at first:
 Since all objects (circle, rectangle and triangle) extend the same abstract object
 we create a new class that is essentially an array of shapes which will hold other shapes
 We create a new composite - aka a shape "folder" (which is also a shape object)
 when we want to create another layer
 Then we can add shapes to the composite and treat them like "files"

 Since all the objects including composite implement the same object (shape) we can
 place composites with composites and shapes at the same level as or inside other composites
 */

public class Composite extends Shape {
    ArrayList<Shape> shapeRoot;

    public Composite(){
        shapeRoot = new ArrayList<>();
    }

    public void add (Shape shape){
        shapeRoot.add(shape);
    }

    @Override
    public void color(String color) {
        for(Shape item : shapeRoot){
            item.color(color);
        }
    }
}
