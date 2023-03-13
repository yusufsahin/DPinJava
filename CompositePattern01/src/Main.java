import com.example.abst.Employee;
import com.example.conc.Developer;
import com.example.conc.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager1=new Manager("John",10000);

        Manager manager2= new Manager("Mary",12000);

        Developer developer1= new Developer("Tom",5000);
        Developer developer2=new Developer("Jerry",6000);
        Developer developer3= new Developer("Peter",5000);

        manager1.add(developer1);

        manager1.add(manager2);

        manager2.add(developer2);
        manager2.add(developer3);


        System.out.println(manager1.getName()+"-"+manager1.getSalary());
        for (Employee employee:manager1.getSubOrdinates())
        {
            System.out.println("++"+employee.getName()+"-"+employee.getSalary());
                if(employee instanceof Manager)
                {
                    for (Employee subEmployee:employee.getSubOrdinates())
                    {
                        System.out.println("+++"+subEmployee.getName()+"-"+subEmployee.getSalary());
                    }
                }
        }

    }
}