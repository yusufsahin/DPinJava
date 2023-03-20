import com.example.abst.DataPoint;
import com.example.abst.Visitor;
import com.example.conc.Age;
import com.example.conc.Belongings;
import com.example.conc.Occupation;
import com.example.conc.PremiumCalculator;

public class Main {
    public static void main(String[] args) {

        DataPoint age = new Age();
        ((Age) age).setAge(30);
        DataPoint occupation = new Occupation();
        ((Occupation) occupation).setOccupation("Engineer");
        DataPoint belongings = new Belongings();
        ((Belongings) belongings).setValue(5000.0);

        // Create a new premium calculator and visit each data point
        Visitor premiumCalculator = new PremiumCalculator();
        age.accept(premiumCalculator);
        occupation.accept(premiumCalculator);
        belongings.accept(premiumCalculator);

        // Retrieve the premium from the premium calculator
        double premium = ((PremiumCalculator) premiumCalculator).getPremium();

        // Display the premium to the customer
        System.out.println("Your premium for theft insurance is: $" + premium);
    }
}