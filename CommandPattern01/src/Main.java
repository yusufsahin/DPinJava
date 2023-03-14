import com.example.abst.Command;
import com.example.abst.Receiver;
import com.example.conc.ConcreteCommand1;
import com.example.conc.ConcreteCommand2;
import com.example.conc.Invoker;
import com.example.conc.ReceiverImpl;

public class Main {
    public static void main(String[] args) {
        Receiver receiver= new ReceiverImpl();

        Command command1=new ConcreteCommand1(receiver);
        Command command2=new ConcreteCommand2(receiver);

        Invoker invoker=new Invoker();

        invoker.setCommand(command1);
        invoker.executeCommand();

        invoker.setCommand(command2);

        invoker.executeCommand();

    }
}