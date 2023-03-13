import com.example.abst.Handler;
import com.example.conc.ConcreteHandler;
import com.example.conc.Request;

public class Main {
    public static void main(String[] args) {

        Handler handler1= new ConcreteHandler();

        Handler handler2= new ConcreteHandler();
        handler1.setNextHandler(handler2);

        Request request1= new Request("Type1","Description1");
        Request request2= new Request("Type2","Description2");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);


    }
}