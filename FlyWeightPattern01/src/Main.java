import com.example.abst.Flyweight;
import com.example.conc.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory= new FlyweightFactory();

        Flyweight flyweight1= factory.getFlyweight("key1");

        flyweight1.operation("state1");

        Flyweight flyweight2= factory.getFlyweight("key1");

        flyweight2.operation("state2");

    }
}