import java.util.Scanner;

public class task3 {
    public static void check(int n, int d) {
        if (n <= 1) {
            System.out.println("Composite");
            return;
        }
        else if (n % d == 0) {
            System.out.println("Composite");
            return;
        }
        else if ((d * d) > n) {
            System.out.println("Prime");
            return;
        }
        check(n, d + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 2;
        check(n, d);
    }
}
