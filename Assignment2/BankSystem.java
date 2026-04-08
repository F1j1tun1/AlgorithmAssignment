import java.util.Scanner;

public class BankSystem {
    private AccountManager accMgr = new AccountManager();
    private TransactionManager tranMgr = new TransactionManager();
    private BillQueueManager billMgr = new BillQueueManager();
    private AccountRequestManager reqMgr = new AccountRequestManager();
    private Scanner sc = new Scanner(System.in);

    public void physicalArray() {
        System.out.println(" ");
        BankAccount[] array = new BankAccount[3];

        array[0] = new BankAccount(1, "Ali", 50000);
        array[1] = new BankAccount(2, "Sara", 25000);
        array[2] = new BankAccount(3, "Beka", 10000);

        for (BankAccount acc: array) {
            System.out.println(acc.getUsername());
            accMgr.addAccount(acc);
        }
    }

    public void bankMenu() {
        boolean run = true;

        while (run) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1.  Request Account");
            System.out.println("2.  Deposit Money");
            System.out.println("3.  Withdraw Money");
            System.out.println("4.  Request Bill Payment");
            System.out.println("5.  View All Transactions");
            System.out.println("6.  Undo Last Transaction");
            System.out.println("0.  Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    controlAddingRequest();
                    break;
                case 2:
                    controlDeposit();
                    break;
                case 3:
                    controlWithdraw();
                    break;
                case 4:
                    controlAddingBill();
                    break;
                case 5:
                    tranMgr.viewAllTransactions();
                    break;
                case 6:
                    controlUndo();
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
    public void atmMenu() {
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
                    controlSearch();
                    break;
                case 2:
                    controlWithdraw();
                    break;
                case 3:
                    System.out.println("last Transaction: " + tranMgr.peek());
                    break;
                case 0:
                    run = false;
                    System.out.println("Leaving ATM...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public void adminMenu() {
        boolean run = true;

        while (run) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1.  Process an Account");
            System.out.println("2.  View Requests");
            System.out.println("3.  Process a Bill");
            System.out.println("4.  View Bills");
            System.out.println("5.  View All Accounts");
            System.out.println("0.  Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    controlProcessRequest();
                    break;
                case 2:
                    reqMgr.viewRequestsQueue();
                    break;
                case 3:
                    controlProcessBill();
                    break;
                case 4:
                    billMgr.viewBillQueue();
                    break;
                case 5:
                    accMgr.viewAccounts();
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

    public void controlAddingRequest() {
        System.out.println("\n--- Request an Account ---");
        System.out.println("Enter Account Number:");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Username:");
        String user = sc.nextLine();
        System.out.println("Enter Balance:");
        double bal = sc.nextDouble();
        sc.nextLine();

        reqMgr.addRequest(new BankAccount(num, user, bal));
        System.out.println("Account Requested for: " + user);
    }
    public void controlDeposit() {
        System.out.println("\n--- Deposit Money ---");
        System.out.println("Enter Username:");
        String user = sc.nextLine();
        BankAccount acc = accMgr.searchByUser(user);
        if (acc != null) {
            System.out.println("Amount:");
            double amount = sc.nextDouble();
            acc.setBalance(acc.getBalance() + amount);
            tranMgr.push("Deposit " + amount + " to " + acc.getUsername());
            System.out.println("New Balance: " + acc.getBalance());
        }
        else {
            System.out.println("User Not Found");
        }
    }
    public void controlWithdraw() {
        System.out.println("\n--- Withdraw Money ---");
        System.out.println("Enter Username:");
        String user = sc.nextLine();
        BankAccount acc = accMgr.searchByUser(user);
        if (acc != null) {
            System.out.println("Amount:");
            double amount = sc.nextDouble();
            if (amount <= acc.getBalance()) {
                acc.setBalance(acc.getBalance() - amount);
                tranMgr.push("Withdraw " + amount + " from " + acc.getUsername());
                System.out.println("New Balance: " + acc.getBalance());
            }
            else {
                System.out.println("Not Enough Money");
            }
        }
        else {
            System.out.println("User Not Found");
        }
    }
    public void controlAddingBill() {
        System.out.println("\n--- Add a Bill ---");
        System.out.println("Enter the Bill:");
        String bill = sc.nextLine();
        billMgr.addBill(bill);
        System.out.println("Added: " + bill);
    }
    public void controlUndo() {
        System.out.println("\n--- Undo Last Transaction ---");
        String last = tranMgr.pop();
        if (last != null) {
            System.out.println("Undo → " + last);
        }
        else {
            System.out.println("No Transactions");
        }
    }
    public void controlSearch() {
        System.out.println("\n--- Search by Username ---");
        System.out.println("Enter Username");
        String user = sc.nextLine();
        BankAccount acc = accMgr.searchByUser(user);
        if (acc != null) {
            System.out.println("User " + acc.getUsername() + " has " + acc.getBalance());
        }
        else {
            System.out.println("User Not Found");
        }
    }
    public void controlProcessRequest() {
        System.out.println("\n--- Process a Requested Account ---");
        BankAccount req = reqMgr.processRequest();
        if (req != null) {
            accMgr.addAccount(req);
            System.out.println("Processed: " + req.getUsername());
        }
        else {
            System.out.println("No Requests in Queue");
        }
    }
    public void controlProcessBill() {
        System.out.println("\n--- Process Requested Bill ---");
        String bill = billMgr.processBill();
        if (bill != null) {
            System.out.println("Processed: " + bill);
            tranMgr.push("Bill " + bill + " Was Paid");
        }
        else {
            System.out.println("No Bills in Queue");
        }
    }
}
