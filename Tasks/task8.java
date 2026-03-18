import java.util.Scanner;

public class task8 {
    public static String digit(String n, int i) {
        if (i == n.length()) {
            return "Yes";
        }
        else if (!Character.isDigit(n.charAt(i))) {
            return "No";
        }
        return digit(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(digit(n, 0));
    }
}
