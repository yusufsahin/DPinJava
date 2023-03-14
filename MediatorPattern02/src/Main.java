import com.example.abst.ChatMediator;
import com.example.abst.User;
import com.example.conc.ChatRoom;
import com.example.conc.ChatUser;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        User user1 = new ChatUser("User1", chatRoom);
        User user2 = new ChatUser("User2", chatRoom);
        User user3 = new ChatUser("User3", chatRoom);
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        user1.send("Hi all!");
        user2.send("Hello, User1!");


    }
}