public class Exercise38_ClassDecompilerDemo {

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Exercise38_ClassDecompilerDemo obj =
                new Exercise38_ClassDecompilerDemo();

        int result = obj.subtract(50, 20);

        System.out.println("Result: " + result);
    }
}