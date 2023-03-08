import com.example.abst.DigitalWalletGateway;
import com.example.conc.CreditCardGateway;
import com.example.conc.CreditCardToDigitalWalletGatewayAdapter;

public class Main {
    public static void main(String[] args) {
        DigitalWalletGateway digitalWalletGateway=new CreditCardToDigitalWalletGatewayAdapter(new CreditCardGateway());

        digitalWalletGateway.pay("1234",1000);

    }
}