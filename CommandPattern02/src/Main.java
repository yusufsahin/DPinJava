import com.example.abst.Command;
import com.example.abst.Light;
import com.example.conc.*;

public class Main {
    public static void main(String[] args) {

        Light bedroomLight= new BedroomLight();
        Light livingRoomLight= new LivingRoomLight();

        Command bedroomLightOn= new LightOnCommand(bedroomLight);
        Command bedroomLightOff= new LightOffCommand(bedroomLight);

        Command livingRoomLightOn= new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff= new LightOffCommand(livingRoomLight);

        RemoteControl bedroomLightRemote= new RemoteControl(bedroomLightOn,bedroomLightOff);
        RemoteControl livingroomLightRemote= new RemoteControl(livingRoomLightOn,livingRoomLightOff);

        bedroomLightRemote.pressOnButton();
        livingroomLightRemote.pressOffButton();
    }
}