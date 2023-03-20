import com.example.User;
import com.example.UserController;
import com.example.UserView;

public class Main {
    public static void main(String[] args) {

        User model= new User("John","Doe","john.doe@example.com");
        UserView view= new UserView();

        UserController controller= new UserController(model,view);

        User newUser= view.getUsetInput();

        controller.updateUserModel(newUser);

        controller.updateUserView();

    }
}