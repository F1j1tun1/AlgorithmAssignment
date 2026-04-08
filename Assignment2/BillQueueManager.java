import java.util.LinkedList;
import java.util.Queue;

public class BillQueueManager {
    private Queue<String> billQueue = new LinkedList<>();

    public void addBill(String bill) {
        billQueue.add(bill);
    }
    public String processBill() {
        if (!billQueue.isEmpty()) {
            return billQueue.poll();
        }
        return null;
    }
    public void viewBillQueue() {
        System.out.println("\n--- Bill Queue ---");
        if (!billQueue.isEmpty()) {
            for (String bill: billQueue) {
                System.out.println("Remaining: " + bill);
            }
        }
        else {
            System.out.println("No Bills in Queue");
        }
    }
}
