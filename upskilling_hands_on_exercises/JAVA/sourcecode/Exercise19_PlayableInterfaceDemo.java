/**
 * Exercise 19 - Playable Interface Demo
 * Objective:
 * Demonstrate interface implementation in Java.
 */

interface Playable {

    void play();

}

class Guitar implements Playable {

    @Override
    public void play() {

        System.out.println("Playing Guitar");

    }
}

class Piano implements Playable {

    @Override
    public void play() {

        System.out.println("Playing Piano");

    }
}

public class Exercise19_PlayableInterfaceDemo {

    public static void main(String[] args) {

        Guitar guitar = new Guitar();

        Piano piano = new Piano();

        guitar.play();

        piano.play();

    }
}