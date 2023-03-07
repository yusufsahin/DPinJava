import com.example.conc.Car;

public class Main {
    public static void main(String[] args) {
        Car car=new Car.Builder()
                .setMake("Toyota")
                .setModel("Corolla")
                .setYear(2023)
                .setColor("White")
                .setNumberOfDoors(4)
                .build();

        System.out.println(car.getMake()+" "+car.getModel()+" "+car.getYear()+" "+car.getColor()+" "+car.getNumberOfDoors());

    }
}