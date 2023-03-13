import com.example.abst.WeatherService;
import com.example.conc.WeatherData;
import com.example.conc.WeatherServiceCacheProxy;
import com.example.conc.WeatherServiceImpl;

public class Main {
    public static void main(String[] args) {

        WeatherService weatherService = new WeatherServiceCacheProxy(new WeatherServiceImpl());
        WeatherData weatherData1 = weatherService.getWeatherData("New York");
        WeatherData weatherData2 = weatherService.getWeatherData("New York");
        System.out.println(weatherData2.getTemp());
    }
}