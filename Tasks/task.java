import java.util.Scanner;

public class task {
    public static void fillArray(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        fillArray(arr, i + 1, sc);
    }
    public static double sum(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }
        return arr[n - 1] + sum(arr, n - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        fillArray(numbers, 0, sc);
        double result = sum(numbers, n);
        double average = result / n;

        System.out.println(average);
    }
}
