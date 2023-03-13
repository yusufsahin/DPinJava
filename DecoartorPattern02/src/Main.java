import com.example.abst.BankAccount;
import com.example.conc.BasicBankAccount;
import com.example.conc.InterestDecorator;
import com.example.conc.OverdraftProtectionDecorator;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BasicBankAccount();

        bankAccount= new OverdraftProtectionDecorator(bankAccount,1000.0);

        bankAccount= new InterestDecorator(bankAccount,0.02);

        bankAccount.deposit(1000.0);

        bankAccount.withdraw(2000.0);

        System.out.println("Balance:$"+bankAccount.getBalance());

    }
}