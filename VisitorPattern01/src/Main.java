import com.example.abst.Visitor;
import com.example.conc.ConcreteVisitor;
import com.example.conc.ElementA;
import com.example.conc.ElementB;

public class Main {
    public static void main(String[] args) {

        Visitor visitor= new ConcreteVisitor();

        ElementA elementA= new ElementA();

        ElementB elementB= new ElementB();

        elementA.accept(visitor);

        elementB.accept(visitor);
    }
}