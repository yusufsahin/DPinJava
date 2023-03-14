import com.example.conc.CurrentConditionsDisplay;
import com.example.conc.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new 		CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(35, 65, 30);
        weatherData.setMeasurements(37, 66, 30);
    }
}