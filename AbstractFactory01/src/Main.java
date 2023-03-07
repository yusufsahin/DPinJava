import com.example.Car;
import com.example.CarFactory;
import com.example.FamilyCarFactory;
import com.example.SportsCarFactory;

public class Main {
    public static void main(String[] args) {

        CarFactory sportsCarFactory= new SportsCarFactory();

        Car sportsCar= sportsCarFactory.createCar();

        sportsCar.drive();

        CarFactory familyCarFactory= new FamilyCarFactory();

        Car familyCar= familyCarFactory.createCar();

        familyCar.drive();

    }
}