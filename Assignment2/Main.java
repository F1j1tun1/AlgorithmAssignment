import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static LinkedList<BankAccount> accounts = new LinkedList<>();
    static Stack<String> transactions = new Stack<>();
    static Queue<String> billQueue = new LinkedList<>();
    static Queue<BankAccount> accountRequests = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        physicalArray();
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
                    bankMenu();
                    break;
                case 2:
                    atmMenu();
                    break;
                case 3:
                    adminMenu();
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
    public static void bankMenu() {
        boolean run = true;

        while (run) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1.  Request Account");
            System.out.println("2.  Deposit Money");
            System.out.println("3.  Withdraw Money");
            System.out.println("4.  Request Bill Payment");
            System.out.println("5.  Undo Last Transaction");
            System.out.println("0.  Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addRequest();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    addBill();
                    break;
                case 5:
                    undoStack();
                    break;
                case 0:
                    run = false;
                    System.out.println("Leaving the Bank...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void atmMenu() {
        boolean run = true;

        while (run) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1.  Check Balance");
            System.out.println("2.  Withdraw");
            System.out.println("3.  View Last Transaction");
            System.out.println("0.  Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    searchByUser();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    if (!transactions.isEmpty()) {
                        System.out.println("Last Transaction: " + transactions.peek());
                    }
                    else {
                        System.out.println("No transactions");
                    }
                case 0:
                    run = false;
                    System.out.println("Leaving ATM...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static void adminMenu() {
        boolean run = true;

        while (run) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1.  Process an Account");
            System.out.println("2.  View Requests");
            System.out.println("3.  Process a Bill");
            System.out.println("4.  View Bills");
            System.out.println("0.  Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    processRequest();
                    break;
                case 2:
                    viewRequestQueue();
                    break;
                case 3:
                    processBill();
                    break;
                case 4:
                    viewBillQueue();
                    break;
                case 0:
                    run = false;
                    System.out.println("Leaving the Admin Area...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    public static void physicalArray() {
        System.out.println(" ");
        BankAccount[] array = new BankAccount[3];

        array[0] = new BankAccount(1, "Ali", 50000);
        array[1] = new BankAccount(2, "Sara", 25000);
        array[2] = new BankAccount(3, "Beka", 10000);

        for (BankAccount acc: array) {
            System.out.println(acc.getUsername());
            accounts.add(acc);
        }
    }
    public static void addAccount() {
        System.out.println("\n--- Add an Account ---");
        System.out.println("Enter Account Number:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Username:");
        String user = sc.nextLine();
        System.out.println("Enter Balance:");
        double bal = sc.nextDouble();

        accounts.add(new BankAccount(num, user, bal));
        System.out.println("Account Added");
    }
    public static void viewAccounts() {
        System.out.println("\n--- Accounts List ---");
        if (accounts.isEmpty()) {
            System.out.println("No Accounts Found");
        }
        else {
            for (BankAccount acc: accounts) {
                System.out.println(acc.getUsername() + " - Balance: " + acc.getBalance());
            }
        }
    }
    public static void searchByUser() {
        System.out.println("\n--- Search By Username ---");
        System.out.println("Enter Username To Find:");
        String user = sc.nextLine();
        for (BankAccount acc: accounts) {
            if (acc.getUsername().equalsIgnoreCase(user)) {
                System.out.println("User " + acc.getUsername() + " has " + acc.getBalance());
                return;
            }
        }
        System.out.println("User Not Found");
    }
    public static void deposit() {
        System.out.println("\n--- Deposit ---");
        System.out.println("Enter Username:");
        String user = sc.nextLine();

        for (BankAccount acc: accounts) {
            if (acc.getUsername().equalsIgnoreCase(user)) {
                System.out.println("Amount:");
                double amount = sc.nextDouble();
                double newBalance = acc.getBalance() + amount;
                acc.setBalance(newBalance);
                System.out.println("New Balance: " + acc.getBalance());
                transactions.push("Deposit " + amount + " to " + acc.getUsername());
                return;
            }
        }
        System.out.println("User Not Found");
    }
    public static void withdraw() {
        System.out.println("\n--- Withdraw ---");
        System.out.println("Enter Username:");
        String user = sc.nextLine();

        for (BankAccount acc: accounts) {
            if (acc.getUsername().equalsIgnoreCase(user)) {
                System.out.println("Amount:");
                double amount = sc.nextDouble();
                if (amount <= acc.getBalance()) {
                    double newBalance = acc.getBalance() - amount;
                    acc.setBalance(newBalance);
                    System.out.println("New Balance: " + acc.getBalance());
                    transactions.push("Withdraw " + amount + " from " + acc.getUsername());
                    return;
                }
                else {
                    System.out.println("Not Enough Money");
                    return;
                }
            }
        }
        System.out.println("User Not Found");
    }
    public static void undoStack() {
        System.out.println("\n--- Undo Last Transaction ---");
        if (!transactions.isEmpty()) {
            String last = transactions.pop();
            System.out.println("Undo → " + last);
        }
        else {
            System.out.println("No Transactions");
        }
    }
    public static void addBill() {
        System.out.println("\n--- Add a Bill ---");
        System.out.println("Enter the Bill:");
        String bill = sc.nextLine();

        billQueue.add(bill);
        System.out.println("Added: " + bill);
    }
    public static void processBill() {
        System.out.println("\n--- Process a Bill ---");
        if (!billQueue.isEmpty()) {
            String bill = billQueue.poll();
            System.out.println("Processing: " + bill);
        }
        else {
            System.out.println("No Bills in the Queue");
        }
    }
    public static void viewBillQueue() {
        System.out.println("\n--- Bill Queue ---");
        if (!billQueue.isEmpty()) {
            for (String q: billQueue) {
                System.out.println("Remaining: " + q);
            }
        }
        else {
            System.out.println("Bill Queue is Empty");
        }
    }
    public static void addRequest() {
        System.out.println("\n--- Request an Account---");
        System.out.println("Enter Account Number:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Username:");
        String user = sc.nextLine();
        System.out.println("Enter Balance:");
        double bal = sc.nextDouble();

        accountRequests.add(new BankAccount(num, user, bal));
        System.out.println("Account requested for: " + user);
    }
    public static void processRequest() {
        System.out.println("\n--- Process a Request ---");
        if (!accountRequests.isEmpty()) {
            BankAccount req = accountRequests.poll();
            accounts.add(req);
            System.out.println("Account Processed: " + req.getUsername());
        }
    }
    public static void viewRequestQueue() {
        System.out.println("\n--- Request Queue ---");
        if (!accountRequests.isEmpty()) {
            for (BankAccount req: accountRequests) {
                System.out.println("Waiting: " + req.getUsername());
            }
        }
        else {
            System.out.println("Request Queue is Empty");
        }
    }
}
