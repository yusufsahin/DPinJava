import com.example.abst.Command;
import com.example.conc.ATM;
import com.example.conc.Account;
import com.example.conc.DepositCommand;
import com.example.conc.WithdrawCommand;

public class Main {
    public static void main(String[] args) {

        Account account= new Account();

        Command depositCommand= new DepositCommand(account,1000);

        Command withdraeCommand= new WithdrawCommand(account,500);

        ATM atm= new ATM(depositCommand,withdraeCommand);

        atm.deposit();
        atm.withdraw();
    }
}