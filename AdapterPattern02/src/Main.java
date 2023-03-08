import com.example.abst.XMLConverter;
import com.example.conc.JSONConvertor;
import com.example.conc.JSONToXMLConvertorAdapter;

public class Main {
    public static void main(String[] args) {

        XMLConverter  xmlConverter= new JSONToXMLConvertorAdapter(new JSONConvertor());
        xmlConverter.convertToXML("John");
    }
}