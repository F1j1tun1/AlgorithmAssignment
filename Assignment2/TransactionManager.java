import java.util.Stack;

public class TransactionManager {
    private Stack<String> transactions = new Stack<>();

    public void push(String action) {
        transactions.push(action);
    }
    public String pop() {
        if (!transactions.isEmpty()) {
            return transactions.pop();
        }
        return null;
    }
    public String peek() {
        if (!transactions.isEmpty()) {
            return transactions.peek();
        }
        else {
            return null;
        }
    }
    public void undo() {
        System.out.println("\n--- Undo Last Transaction ---");
        String last = transactions.pop();
        if (last != null) {
            System.out.println("Undo → " + "'" + last + "'");
        }
        else {
            System.out.println("No Transactions");
        }
    }
    public void viewAllTransactions() {
        System.out.println("\n--- All Transactions ---");
        if (!transactions.isEmpty()) {
            for (String tr: transactions) {
                System.out.println(tr);
            }
        }
        else {
            System.out.println("No Transactions");
        }
    }
}
