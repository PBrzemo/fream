package Shapes;

public class Circle extends Shape {
    @Override
    public String toString() {
        return "Circle{}";
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}