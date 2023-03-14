import com.example.abst.Mediator;
import com.example.conc.Button;
import com.example.conc.ConcreteMediator;
import com.example.conc.Dialog;

public class Main {
    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();
        Button button = new Button(mediator);
        Dialog dialog = new Dialog(mediator);

        mediator.setButton(button);
        mediator.setDialog(dialog);

        button.click(); // This should show the dialog
        dialog.hide();  // This should hide the dialog
    }
}