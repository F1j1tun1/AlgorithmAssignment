import java.util.Scanner;

public class task {
    public static void function(int n){
        if(n == 0) return;
        function(n / 10);
        System.out.println(n % 10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(n);
    }
}
