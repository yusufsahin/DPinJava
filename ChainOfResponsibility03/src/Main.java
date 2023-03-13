import com.example.abst.FraudDetector;
import com.example.conc.MachineLearningDetector;
import com.example.conc.RuleBasedDetector;
import com.example.conc.Transaction;
import com.example.conc.TransactionMonitoringDetector;

public class Main {
    public static void main(String[] args) {

        FraudDetector transactionMonitoringDetector = new TransactionMonitoringDetector();
        FraudDetector ruleBasedDetector = new RuleBasedDetector();
        FraudDetector machineLearningDetector = new MachineLearningDetector();

        transactionMonitoringDetector.setNextDetector(ruleBasedDetector);
        ruleBasedDetector.setNextDetector(machineLearningDetector);

        Transaction transaction1 = new Transaction("1001", 5000);
        Transaction transaction2 = new Transaction("1002", 20000);
        Transaction transaction3 = new Transaction("1003", 100000);

        System.out.println("Checking transaction 1 for fraud...");
        boolean fraudDetected1 = transactionMonitoringDetector.detectFraud(transaction1);
        System.out.println("Fraud detected: " + fraudDetected1);

        System.out.println("Checking transaction 2 for fraud...");
        boolean fraudDetected2 = transactionMonitoringDetector.detectFraud(transaction2);
        System.out.println("Fraud detected: " + fraudDetected2);

        System.out.println("Checking transaction 3 for fraud...");
        boolean fraudDetected3 = transactionMonitoringDetector.detectFraud(transaction3);
        System.out.println("Fraud detected: " + fraudDetected3);

    }
}