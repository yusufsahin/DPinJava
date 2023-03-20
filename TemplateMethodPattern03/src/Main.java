import com.example.abst.AbstaractBillingSystem;
import com.example.conc.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        AbstaractBillingSystem voiceBillingSystem = new VoiceBillingSystem();
        AbstaractBillingSystem messageBillignSystem= new MessageBillingSystem();

        AbstaractBillingSystem dataBillingSystem= new DataBillingSystem();


        Customer customer= new Customer("John Doe");

        customer.addService(new ServiceUsage("voice",100));
        customer.addService(new ServiceUsage("messaging",50));
        customer.addService(new ServiceUsage("data",2000));

        BigDecimal billAmountVoice= voiceBillingSystem.generateBill(customer);
        BigDecimal billAmountMessage= messageBillignSystem.generateBill(customer);
        BigDecimal billAmountData= dataBillingSystem.generateBill(customer);

        BigDecimal total= billAmountVoice.add(billAmountMessage.add(billAmountData));
        System.out.println("Bill amount for "+customer.getName()+" is "+total);

    }
}