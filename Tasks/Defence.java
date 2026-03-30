import java.util.Scanner;

public class Defence {
    public static void function(Scanner sc, int n) {
        if (n <= 0) {
            return;
        }
        int a = sc.nextInt();
        function(sc, n - 1);
        System.out.println(a + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        function(scanner, n);
    }
}
