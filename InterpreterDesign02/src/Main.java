import com.example.abst.Expression;
import com.example.conc.*;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Expression rule = new AndExpression(
                new RoleExpression("admin"),
                new OrExpression(
                        new RoleExpression("report_viewer"),
                        new NotExpression(new RoleExpression("blacklisted"))
                )
        );

        PermissionEvaluator evaluator = new PermissionEvaluator(rule);

        User user1 = new User("John", new HashSet<>(Arrays.asList("admin", "report_viewer")));
        Report report1 = new Report("Sales Report", new HashSet<>(Arrays.asList("admin", "report_viewer")));

        boolean hasPermission = evaluator.hasPermission(user1, report1);

        System.out.println(user1.getUsername() + " has permission to access " + report1.getReportName() + ": " + hasPermission);

        User user2 = new User("Alice", new HashSet<>(Arrays.asList("report_viewer", "blacklisted")));
        Report report2 = new Report("Marketing Report", new HashSet<>(Arrays.asList("admin", "report_viewer")));

        hasPermission = evaluator.hasPermission(user2, report2);

        System.out.println(user2.getUsername() + " has permission to access " + report2.getReportName() + ": " + hasPermission);


    }
}