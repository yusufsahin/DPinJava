import com.example.conc.CancelledOrderState;
import com.example.conc.Item;
import com.example.conc.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Add items to the order
        order.addItem(new Item("Product 1", 10.0));
        order.addItem(new Item("Product 2", 20.0));

        // Update order status
        order.updateStatus();

        // Issue a refund
        order.issueRefund();

        // Cancel the order
        order.setState(new CancelledOrderState());
    }
}