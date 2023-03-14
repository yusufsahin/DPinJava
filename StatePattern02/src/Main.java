import com.example.conc.TrafficLight;

public class Main {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight();

        // Simulate 10 cycles of traffic light operation
        for (int i = 0; i < 10; i++) {
            light.operate();
        }

    }
}