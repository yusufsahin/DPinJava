import com.example.abst.MessageBuilder;
import com.example.conc.EmailMessage;

public class Main {
    public static void main(String[] args) {

        MessageBuilder<EmailMessage> builder= new EmailMessage.EmailMessageBuilder();
        EmailMessage.EmailDirector director= new EmailMessage.EmailDirector(builder);
        director.sendEmail();
    }
}