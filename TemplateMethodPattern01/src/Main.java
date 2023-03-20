import com.example.abst.AbstractClass;
import com.example.conc.ConcreteClass;

public class Main {
    public static void main(String[] args) {
        AbstractClass obj= new ConcreteClass();

        obj.templateMethod();

    }
}