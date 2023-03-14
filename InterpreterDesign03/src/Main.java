import com.example.abst.Expression;
import com.example.conc.Context;
import com.example.conc.CreditScoreExpression;
import com.example.conc.EmploymentStatusExpression;
import com.example.conc.IncomeExpression;

public class Main {
    public static void main(String[] args) {
        Context context1 = new Context(60000, "employed", 750);
        Context context2 = new Context(40000, "unemployed", 650);

        Expression incomeExpression = new IncomeExpression(50000);
        Expression employmentStatusExpression = new EmploymentStatusExpression("employed");
        Expression creditScoreExpression = new CreditScoreExpression(700);

        boolean isEligible1 = incomeExpression.interpret(context1) && employmentStatusExpression.interpret(context1) && creditScoreExpression.interpret(context1);
        boolean isEligible2 = incomeExpression.interpret(context2) && employmentStatusExpression.interpret(context2) && creditScoreExpression.interpret(context2);

        System.out.println("Is person 1 eligible for credit? " + isEligible1);
        System.out.println("Is person 2 eligible for credit? " + isEligible2);


    }
}