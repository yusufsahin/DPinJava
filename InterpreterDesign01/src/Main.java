import com.example.abst.Expression;
import com.example.conc.MinusExpression;
import com.example.conc.NumberExpression;
import com.example.conc.PlusExpression;

public class Main {
    public static void main(String[] args) {

        Expression expression= new PlusExpression(new NumberExpression(5),new MinusExpression(new NumberExpression(10),new NumberExpression(3)));

        int result=expression.interpret();

        System.out.println(result);
    }
}