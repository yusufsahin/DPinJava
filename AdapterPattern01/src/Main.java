import com.example.abst.TargetInterface;
import com.example.conc.Adaptee;
import com.example.conc.Adapter;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee= new Adaptee();
        TargetInterface target= new Adapter(adaptee);
        target.request();

    }
}