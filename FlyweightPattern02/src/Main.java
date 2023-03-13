import com.example.conc.TextEditor;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addCharacter('H', 0, 0, 12, Font.BOLD);
        editor.addCharacter('e', 10, 0, 12, Font.PLAIN);
        editor.addCharacter('l', 20, 0, 12, Font.ITALIC);
        editor.addCharacter('l', 30, 0, 12, Font.PLAIN);
        editor.addCharacter('o', 40, 0, 12, Font.BOLD);

        editor.draw();


    }
}