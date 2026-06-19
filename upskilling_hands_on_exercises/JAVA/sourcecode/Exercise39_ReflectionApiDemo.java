import java.lang.reflect.Method;

public class Exercise39_ReflectionApiDemo {

    // sample method 1
    public void showMessage(String name) {
        System.out.println("Hello " + name);
    }

    // sample method 2
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        try {
            // 1. Load class dynamically
            Class<?> cls = Class.forName("Exercise39_ReflectionApiDemo");

            // 2. Create object dynamically
            Object obj = cls.getDeclaredConstructor().newInstance();

            // 3. Get all methods
            Method[] methods = cls.getDeclaredMethods();

            System.out.println("Methods in class:");

            for (Method m : methods) {
                System.out.println("Method Name: " + m.getName());

                // print parameters
                Class<?>[] params = m.getParameterTypes();
                System.out.print("Parameters: ");
                for (Class<?> p : params) {
                    System.out.print(p.getSimpleName() + " ");
                }
                System.out.println("\n---");
            }

            // 4. Invoke method dynamically (example)
            Method method1 = cls.getMethod("showMessage", String.class);
            method1.invoke(obj, "Java Reflection");

            Method method2 = cls.getMethod("add", int.class, int.class);
            Object result = method2.invoke(obj, 10, 20);

            System.out.println("Result of add: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}