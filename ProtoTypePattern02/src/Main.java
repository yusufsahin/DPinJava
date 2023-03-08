import com.example.abst.Customer;
import com.example.conc.OneOnOneCustomer;
import com.example.conc.ProfessionalCustomer;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Customer.loadCustomers();

        Customer oneOnOneCustomer = (Customer) Customer.customerMap.get("oneOnOne").clone();
        oneOnOneCustomer.displayInfo();

        Customer professionalCustomer = (Customer) Customer.customerMap.get("professional").clone();
        professionalCustomer.displayInfo();

        OneOnOneCustomer o= new OneOnOneCustomer();
        o.setName("Test");
        o.setEmail("test@test.com");
        o.setPhone("1234567");

        OneOnOneCustomer o1= (OneOnOneCustomer) o.clone();

        System.out.println(o.getName()+"="+o1.getName());

        //ProfessionalCustomer p= (ProfessionalCustomer) o.clone();
    }

}