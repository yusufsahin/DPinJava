import com.example.conc.BinaryObserver;
import com.example.conc.HexaObserver;
import com.example.conc.OctalObserver;
import com.example.conc.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

    }
}