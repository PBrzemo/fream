package Shapes;

public class Triangle extends Shape {
    @Override
    public String toString() {
        return "Triangle{}";
    }

    @Override
        public void draw() {
            System.out.println("Triangle");
        }
    }