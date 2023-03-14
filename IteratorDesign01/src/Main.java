import com.example.conc.ConcreteIterator;
import com.example.conc.ConreteAggregate;

public class Main {
    public static void main(String[] args) {
        ConreteAggregate a= new ConreteAggregate();

        a.set(0,"Item A");
        a.set(1, "Item B");
        a.set(2, "Item C");
        a.set(3, "Item D");

        ConcreteIterator i= new ConcreteIterator(a);

        System.out.println("Iterating over collection");

        Object item=i.first();

        while (item!=null)
        {
            System.out.println(item);
            item=i.next();
        }
    }
}