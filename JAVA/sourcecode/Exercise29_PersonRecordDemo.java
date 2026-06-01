import java.util.Arrays;
import java.util.List;

/**
 * Exercise 29 - Person Record Demo
 * Objective:
 * Demonstrate Java Records and Stream API.
 */

record Person(String name, int age) {
}

public class Exercise29_PersonRecordDemo {

    public static void main(String[] args) {

        Person person1 = new Person("Sai", 21);
        Person person2 = new Person("Arun", 17);
        Person person3 = new Person("Priya", 25);

        System.out.println("Individual Records:");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        List<Person> people =
                Arrays.asList(person1, person2, person3);

        System.out.println("\nPeople Age >= 18:");

        people.stream()
              .filter(person -> person.age() >= 18)
              .forEach(System.out::println);

    }
}