public class BankAccount {
    private int accountNumber;
    private String username;
    private double balance;

    public BankAccount(int accountNumber, String username, double balance) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getUsername() {
        return username;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
