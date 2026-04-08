import java.util.LinkedList;

public class AccountManager {
    private LinkedList<BankAccount> accounts = new LinkedList<>();

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    public BankAccount searchByUser(String user) {
        for (BankAccount acc: accounts) {
            if (acc.getUsername().equalsIgnoreCase(user)) {
                return acc;
            }
        }
        return null;
    }

    public void viewAccounts() {
        if(!accounts.isEmpty()) {
            for (BankAccount acc: accounts) {
                System.out.println(acc.getUsername() + " - Balance: " + acc.getBalance());
            }
        }
        else {
            System.out.println("No Accounts Found");
        }
    }
}
