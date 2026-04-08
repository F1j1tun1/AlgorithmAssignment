import java.util.LinkedList;
import java.util.Queue;

public class AccountRequestManager {
    private Queue<BankAccount> requestsQueue = new LinkedList<>();

    public void addRequest(BankAccount req) {
        requestsQueue.add(req);
    }
    public BankAccount processRequest() {
        if (!requestsQueue.isEmpty()) {
            return requestsQueue.poll();
        }
        else {
            return null;
        }
    }
    public void viewRequestsQueue() {
        System.out.println("\n--- Request Queue ---");
        if (!requestsQueue.isEmpty()) {
            for (BankAccount acc: requestsQueue) {
                System.out.println("Waiting: " + acc.getUsername());
            }
        }
        else {
            System.out.println("Request Queue is Empty");
        }
    }
}
