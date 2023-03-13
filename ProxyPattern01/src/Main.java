import com.example.abst.Image;
import com.example.conc.ImageProxy;

public class Main {
    public static void main(String[] args) {
        Image image= ImageProxy.createProxy("test.jpg");
        image.display();

        System.out.println("-----");

        image.display();
    }
}