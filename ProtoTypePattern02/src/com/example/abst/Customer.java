package com.example.abst;

import com.example.conc.OneOnOneCustomer;
import com.example.conc.ProfessionalCustomer;
import java.util.HashMap;
import java.util.Map;
public abstract class Customer implements Cloneable {
    private String name;
    private String email;
    private String phone;

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static Map<String, Customer> customerMap = new HashMap<String, Customer>();

    public static void loadCustomers() {
        OneOnOneCustomer oneOnOneCustomer = new OneOnOneCustomer();
        oneOnOneCustomer.setName("John Doe");
        oneOnOneCustomer.setEmail("johndoe@example.com");
        oneOnOneCustomer.setPhone("123-456-7890");
        customerMap.put("oneOnOne", oneOnOneCustomer);

        ProfessionalCustomer professionalCustomer = new ProfessionalCustomer();
        professionalCustomer.setName("Jane Smith");
        professionalCustomer.setEmail("janesmith@example.com");
        professionalCustomer.setPhone("987-654-3210");
        customerMap.put("professional", professionalCustomer);
    }
}