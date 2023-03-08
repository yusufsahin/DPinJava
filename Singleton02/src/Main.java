import com.example.conc.Configuration;
import com.example.conc.Logger;

public class Main {
    private static Logger logger= Logger.getInstance();
    private static  Configuration config= Configuration.getInstance();
    public static void main(String[] args) {
        logger.log("Starting application");
        logger.log("Shutting down application");

      //  Configuration config = Configuration.getInstance();
        String serverUrl = config.getSettings("serverUrl");
        String timeout =config.getSettings("timeout");
        String maxConnections = config.getSettings("maxConnections");
        System.out.println("Server URL: " + serverUrl);
        System.out.println("Timeout: " + timeout);
        System.out.println("Max Connections: " + maxConnections);

    }
}