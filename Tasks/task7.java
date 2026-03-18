import java.util.Scanner;

public class task7 {
    public static void flip(int n, Scanner sc) {
        if (n == 0) {
            return;
        }
        int a = sc.nextInt();
        flip(n - 1, sc);
        System.out.println(a + " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        flip(n, sc);
    }
}
