package Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ShapeRun {

    public static void main(String[] args) {
        Factory shapeFactory = new Factory();

        Shape CIRCLE = shapeFactory.getShape("CIRCLE");
        CIRCLE.draw();
        Shape TRIANGLE = shapeFactory.getShape("TRIANGLE");
        TRIANGLE.draw();
        Shape SQUARE = shapeFactory.getShape("SQUARE");
        SQUARE.draw();
        System.out.println("-----------------------------------");

        List<Shape> list = new ArrayList<>();
        list.add(CIRCLE);
        list.add(TRIANGLE);
        list.add(SQUARE);
        System.out.println(list);
        System.out.println("-----------------------------------");
        List<Shape> filtr = list.stream()
                .filter(l -> !TRIANGLE.equals(l)&& !SQUARE.equals(l))
                .collect(Collectors.toList());
        filtr.forEach(System.out::println);
        System.out.println("-----------------------------------");

        Function<Circle, String>createString = Object::toString;
        System.out.println(createString);
        System.out.println("-----------------------------------");


    }

}