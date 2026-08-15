import java.util.Scanner;

public class Calculator {
    public static void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First variable:");
        double a = scanner.nextDouble();
        System.out.println("Action:");
        String x = scanner.next();
        System.out.println("Second Variable:");
        double b = scanner.nextDouble();

        switch (x) {
            case "+" -> plus(scanner, a, x, b);
            case "-" -> minus(scanner, a, x, b);
            case "*" -> multiply(scanner, a, x, b);
            case "/" -> {
                if (a == 0 || b == 0) {
                    System.out.println("Cannot divide by 0. Please try again.");
                    function();
                } else {
                    divide(scanner, a, x, b);
                }
            }
            case null, default -> {
                System.out.println("Wrong Action. Please try again.");
                function();
            }
        }
    }
    public static void plus(Scanner sc, double a, String x, double b) {
        double result = 0;
        result = a + b;
        System.out.println("Answer = " + result);
        System.out.println("Try again?");
        String q = sc.next();
        if (q.equalsIgnoreCase("y") || q.equalsIgnoreCase("yes")) {
            function();
        } else {
            System.out.println("Thank you for using my Calculator!");
        }
    }
    public static void minus(Scanner sc, double a, String x, double b) {
        double result = 0;
        result = a - b;
        System.out.println("Answer = " + result);
        System.out.println("Try again?");
        String q = sc.next();
        if (q.equalsIgnoreCase("y") || q.equalsIgnoreCase("yes")) {
            function();
        } else {
            System.out.println("Thank you for using my Calculator!");
        }
    }
    public static void multiply(Scanner sc, double a, String x, double b) {
        double result = 0;
        result = a * b;
        System.out.println("Answer = " + result);
        System.out.println("Try again?");
        String q = sc.next();
        if (q.equalsIgnoreCase("y") || q.equalsIgnoreCase("yes")) {
            function();
        } else {
            System.out.println("Thank you for using my Calculator!");
        }
    }
    public static void divide(Scanner sc, double a, String x, double b) {
        double result = 0;
        result = a / b;
        System.out.println("Answer = " + result);
        System.out.println("Try again?");
        String q = sc.next();
        if (q.equalsIgnoreCase("y") || q.equalsIgnoreCase("yes")) {
            function();
        } else {
            System.out.println("Thank you for using my Calculator!");
        }
    }
    public static void main(String[] args) {
        function();
    }
}
