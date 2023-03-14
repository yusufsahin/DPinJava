import com.example.conc.Caretaker;
import com.example.conc.InsurancePolicy;

public class Main {
    public static void main(String[] args) {
        InsurancePolicy policy = new InsurancePolicy("John Doe", 12345, "Auto");
        Caretaker caretaker= new Caretaker();
        System.out.println("Original Policy: " + policy.getPolicyName() + " - " + policy.getPolicyNumber() + " - " + policy.getPolicyType());
        caretaker.savePolicy(policy);
        policy.setPolicyType("Homeowners");
        System.out.println("Updated Policy: " + policy.getPolicyName() + " - " + policy.getPolicyNumber() + " - " + policy.getPolicyType());
        caretaker.restorePolicy(policy);
        System.out.println("Restored Policy: " + policy.getPolicyName() + " - " + policy.getPolicyNumber() + " - " + policy.getPolicyType());

    }
}