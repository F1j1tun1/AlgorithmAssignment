import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankSystem sys = new BankSystem();
        Scanner sc = new Scanner(System.in);
        sys.physicalArray();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Bank Account Management ---");
            System.out.println("1.  Enter Bank");
            System.out.println("2.  Enter ATM");
            System.out.println("3.  Admin Area");
            System.out.println("0.  Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    sys.bankMenu();
                    break;
                case 2:
                    sys.atmMenu();
                    break;
                case 3:
                    sys.adminMenu();
                    break;
                case 0:
                    running = false;
                    System.out.println("Leaving...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
