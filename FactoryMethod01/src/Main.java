import com.example.abst.Animal;
import com.example.conc.AnimalFactory;
import com.example.conc.Cat;

public class Main {
    public static void main(String[] args) {

        Animal bird=  AnimalFactory.createAnimal("bird");

        bird.speak();

    }
}