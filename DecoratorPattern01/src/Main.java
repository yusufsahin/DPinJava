import com.example.abst.Coffee;
import com.example.conc.MilkDecorator;
import com.example.conc.SimpleCoffee;
import com.example.conc.SugarDecorator;

public class Main {
    public static void main(String[] args) {

        Coffee coffee= new SimpleCoffee();
        coffee= new MilkDecorator(coffee);
        coffee=new SugarDecorator(coffee);

        System.out.println(coffee.getDescription()+":$"+ coffee.getCost());

    }
}