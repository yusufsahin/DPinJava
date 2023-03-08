import com.example.conc.Circle;
import com.example.conc.Square;

public class Main {
    public static void main(String[] args) {

        Circle y= new Circle();
        Circle yClone=(Circle) y.clone();
        System.out.println(y.getType());
        System.out.println(y.getType());

        Square square= new Square();

        Square clonedSquare= (Square) square.clone();

        System.out.println(square.getType());
        System.out.println(clonedSquare.getType());

    }
}