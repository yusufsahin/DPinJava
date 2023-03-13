import com.example.abst.Database;
import com.example.conc.DatabaseProxy;
import com.example.conc.RealDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        try
        {

            Database database= new DatabaseProxy();
            Map<String, String> values=new HashMap<>();
            values.put("name", "John");
            values.put("age", "30");
            database.insert("person", values);

            values = new HashMap<>();
            values.put("name", "Jane");
            values.put("age", "25");
            database.update("person", values, "id = 1");
            database.delete("person", "id = 2");


        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}