import java.util.Scanner;

public class task9 {
    public static int counting(String n, int i, int count) {
        if (i == n.length()) {
            return count;
        }
        count++;
        return counting(n, i + 1, count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        System.out.println(counting(n, 0, count));
    }
}
