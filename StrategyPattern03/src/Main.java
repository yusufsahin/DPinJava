import com.example.conc.*;

public class Main {
    public static void main(String[] args) {

        Order order= new Order();

        order.addProduct(new Product("Laptop",1500));
        order.addProduct(new Product("Mause",35));

        //Credit Card Strategy
        order.setPaymentStrategy(new CreditCardStrategy("1234 5678 9123 4567","John Doe","12/28","123"));
        order.processPayment();

        //set the payment strategy to PayPal
        order.setPaymentStrategy(new PayPalStrategy("john.doe@example.com","pass123456"));
        order.processPayment();

        //set the payment strategy to cash on delivery

        order.setPaymentStrategy(new CashOnDeliveryStrategy("123 Main St."));
        order.processPayment();
    }
}