import com.example.abst.PolicyManagementSystem;
import com.example.conc.PolicyManagementSystemImpl;
import com.example.conc.Policyholder;

public class Main {
    public static void main(String[] args) {
        PolicyManagementSystemImpl policyManagementSystem = new PolicyManagementSystemImpl();

        Policyholder policyholder1 = new Policyholder(policyManagementSystem);
        Policyholder policyholder2 = new Policyholder(policyManagementSystem);

        policyholder1.purchasePolicy("car", 50000, 500, "John Doe, New York");
        policyholder2.purchasePolicy("home", 100000, 1000, "Jane Smith, Los Angeles");

        policyholder1.updatePolicy("1", 75000, 750, "John Doe, New York");
        policyholder2.fileClaim("2", "Theft of jewelry");

        System.out.println(policyManagementSystem.getPolicies());

    }
}