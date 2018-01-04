package Shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ShapeRun {

    public static void main(String[] args) {
        Factory shapeFactory = new Factory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape triangle = shapeFactory.getShape("TRIANGLE");
        triangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
        System.out.println("-----------------------------------");

        List<Shape> list = new ArrayList<>();
        list.add(circle);
        list.add(triangle);
        list.add(square);
        System.out.println(list);
        System.out.println("-----------------------------------");
        List<Shape> filtr = list.stream()
                .filter(l -> !triangle.equals(l)&& !square.equals(l))
                .collect(Collectors.toList());
        filtr.forEach(System.out::println);
        System.out.println("-----------------------------------");

        Function<Circle, String>createString = Object::toString;// to check
        System.out.println(createString);
        System.out.println("-----------------------------------");


    }

}