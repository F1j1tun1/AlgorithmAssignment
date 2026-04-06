import java.util.Scanner;

public class task6 {
    public static int power(int a, int n) {
        if (a == 1) {
            return 1;
        }
        else if (a == 0) {
            return 0;
        }
        else if (n <= 1) {
            return a;
        }
        return a * power(a, n - 1);
    }
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(a, n));
    }
}
