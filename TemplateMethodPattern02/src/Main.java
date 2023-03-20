import com.example.abst.Game;
import com.example.conc.Checkers;
import com.example.conc.Chess;

public class Main {
    public static void main(String[] args) {

        Game chess= new Chess();
        chess.play();

        Game checkers= new Checkers();
        checkers.play();
    }
}