import com.example.abst.PaymentProcessor;
import com.example.abst.PaymentProcessorFactory;
import com.example.conc.*;

public class Main {
    public static void main(String[] args) {

        PaymentProcessorFactory payPalPaymentProcessorFactory= new PayPalPaymentProcessorFactory();
        PaymentProcessor paypalPaymentProcessor = payPalPaymentProcessorFactory.createPaymentProcessor();
        paypalPaymentProcessor.processPayment(100);

        PaymentProcessorFactory creditCardPaymentProcessorFactory= new CreditCardPaymentProcessorFactory();
        PaymentProcessor creditCardPaymentProcessor= new CreditCardPaymentProcessor();
        creditCardPaymentProcessor.processPayment(500);


        PaymentProcessorFactory bankTransferPaymentProcessorFactory=new BankTransferPaymentProcessorFactory();
        PaymentProcessor banktransferPaymentProcessor= new BankTransferPaymentProcessor();
        banktransferPaymentProcessor.processPayment(1000);


    }
}