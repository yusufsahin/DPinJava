import com.example.conc.EmailNotification;
import com.example.conc.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        SavingsAccount account= new SavingsAccount();
        EmailNotification emailNotification= new EmailNotification("examplq@example.com");
        account.registerObserver(emailNotification);
        account.deposit(1000.0);
        account.withdraw(500.0);

    }
}