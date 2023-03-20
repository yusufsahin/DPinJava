import com.example.abst.DataPoint;
import com.example.conc.Customer;
import com.example.conc.Product;
import com.example.conc.Sale;
import com.example.conc.SalesAnalyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<DataPoint> dataPoints= new ArrayList<>();
        dataPoints.add(new Product("P1", "Product 1", 10.0, 100));
        dataPoints.add(new Product("P2", "Product 2", 20.0, 50));
        dataPoints.add(new Customer("C1", "Customer 1", "customer1@example.com"));
        dataPoints.add(new Customer("C2", "Customer 2", "customer2@example.com"));
        dataPoints.add(new Sale("S1", new Date(), (Customer) dataPoints.get(2), Arrays.asList((Product) dataPoints.get(0))));
        dataPoints.add(new Sale("S2", new Date(), (Customer) dataPoints.get(3), Arrays.asList((Product) dataPoints.get(0), (Product) dataPoints.get(1))));

        // Create a new SalesAnalyzer visitor and visit each data point
        SalesAnalyzer salesAnalyzer = new SalesAnalyzer();
        dataPoints.forEach(dataPoint -> dataPoint.accept(salesAnalyzer));

        // Print the product sales and customer sales data
        System.out.println("Product Sales:");
        salesAnalyzer.getProductSales().forEach((productName, quantity) -> System.out.println(productName + ": " + quantity));

        System.out.println("Customer Sales:");
        salesAnalyzer.getCustomerSales().forEach((customerName, totalSale) -> System.out.println(customerName + ": $" + totalSale));

    }
}