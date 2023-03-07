import com.example.base.abst.Button;
import com.example.base.abst.CheckBox;
import com.example.base.abst.GUIFactory;
import com.example.base.conc.*;

public class Main {
    public static void main(String[] args) {
        MacGUIFactory macGUIFactor = new MacGUIFactory();

        Button macButton= macGUIFactor.createButton();
        macButton.paint();

        CheckBox macCheckBox= macGUIFactor.createCheckBox();

        macCheckBox.paint();


        WindowGUIFactory windowGUIFactory= new WindowGUIFactory();

        Button winButton= windowGUIFactory.createButton();

        winButton.paint();

        CheckBox winCheckBox= windowGUIFactory.createCheckBox();
        winCheckBox.paint();

    }
}