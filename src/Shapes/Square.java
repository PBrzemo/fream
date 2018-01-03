package Shapes;

public class Square extends Shape {
    @Override
    public String toString() {
        return "Square{}";
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }
}