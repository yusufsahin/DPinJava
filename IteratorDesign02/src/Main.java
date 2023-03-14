import com.example.abst.Iterator;
import com.example.conc.Employee;
import com.example.conc.EmployeeCollection;

public class Main {
    public static void main(String[] args) {
        EmployeeCollection employeeCollection= new EmployeeCollection();

        employeeCollection.addEmployee(new Employee("John Doe",35,"Manager"));
        employeeCollection.addEmployee(new Employee("Jane Doe",29,"VP"));
        employeeCollection.addEmployee(new Employee("Bob Doe",25,"Developer"));

        Iterator<Employee> iterator= employeeCollection.createIterator();
        while (iterator.hasNext())
        {
            Employee employee=iterator.next();
            System.out.println(employee);
        }
    }
}