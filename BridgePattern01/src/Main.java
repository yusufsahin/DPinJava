import com.example.abst.TV;
import com.example.conc.LGTV;
import com.example.conc.LogitechRemoteController;

public class Main {
    public static void main(String[] args) {

        TV tv= new LGTV();

        LogitechRemoteController lrc= new LogitechRemoteController(tv);
        lrc.setChannelBoard(5);
    }
}