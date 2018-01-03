package ksztalty;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pattern {

    public static void main(String[] args) {
        Factory shapeFactory = new Factory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("TRIANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
        System.out.println("-----------------------------------");

        List<Shape> list = new ArrayList<>();
        list.add(shape1);
        list.add(shape2);
        list.add(shape3);
        System.out.println(list);
        System.out.println("-----------------------------------");
        List<Shape> filtr = list.stream()
                .filter(l -> !shape2.equals(l)&& !shape3.equals(l))
                .collect(Collectors.toList());
        filtr.forEach(System.out::println);
        System.out.println("-----------------------------------");
        Function<Shape, String>createString = Shape::toString;
        System.out.println(createString);
        System.out.println("-----------------------------------");


    }



}