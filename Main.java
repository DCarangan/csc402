//Main.java
public class Main {
    public static void main(String[] args) {
        // Represents: (3 + 5) * 2
        Expression expr = new Multiplication(
            new Addition(new Number(3), new Number(5)),
            new Number(2)
        );

        // Evaluate
        int result = expr.evaluate();
        System.out.println("Evaluated Result: " + result); // Output: 16

        // Print
        String str = expr.print();
        System.out.println("Printed Expression: " + str); // Output: ((3 + 5) * 2)
    }
}
