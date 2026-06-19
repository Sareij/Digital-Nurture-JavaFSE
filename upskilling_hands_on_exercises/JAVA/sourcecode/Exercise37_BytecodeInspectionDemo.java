public class Exercise37_BytecodeInspectionDemo {

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Exercise37_BytecodeInspectionDemo obj =
                new Exercise37_BytecodeInspectionDemo();

        int result = obj.multiply(6, 7);

        System.out.println("Result: " + result);
    }
}