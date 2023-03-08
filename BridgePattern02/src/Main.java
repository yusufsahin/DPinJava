import com.example.abst.BankAccount;
import com.example.abst.InsurancePolicy;
import com.example.conc.LifeInsurance;
import com.example.conc.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        InsurancePolicy policy = new LifeInsurance(1000.0);
        BankAccount account = new SavingsAccount(policy);

        account.deposit(500.0);
        account.checkBalance();

        // Change the insurance policy and pay the premium
        account.setInsurancePolicy(new LifeInsurance(2000.0));
        account.insurancePolicy.payPremium();


    }
}