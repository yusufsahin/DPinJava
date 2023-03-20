import com.example.conc.ConcreteStrategyA;
import com.example.conc.ConcreteStrategyB;
import com.example.conc.ConcreteStrategyC;
import com.example.conc.Context;

public class Main {
    public static void main(String[] args) {
        Context context= new Context(new ConcreteStrategyA());

        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyB());

        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyC());

        context.executeStrategy();

    }
}