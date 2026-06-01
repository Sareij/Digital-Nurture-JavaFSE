/**
 * Exercise 30 - Pattern Matching Switch Demo
 * Objective:
 * Demonstrate Pattern Matching for switch (Java 21).
 */

public class Exercise30_PatternMatchingSwitchDemo {

    public static void checkType(Object obj) {

        switch (obj) {

            case Integer i ->
                    System.out.println("Integer Value: " + i);

            case String s ->
                    System.out.println("String Value: " + s);

            case Double d ->
                    System.out.println("Double Value: " + d);

            case Float f ->
                    System.out.println("Float Value: " + f);

            case Long l ->
                    System.out.println("Long Value: " + l);

            case null ->
                    System.out.println("Object is null");

            default ->
                    System.out.println(
                            "Unknown Type: "
                                    + obj.getClass().getSimpleName());

        }

    }

    public static void main(String[] args) {

        checkType(100);

        checkType("Java");

        checkType(99.99);

        checkType(12.5f);

        checkType(1000L);

        checkType(null);

    }
}