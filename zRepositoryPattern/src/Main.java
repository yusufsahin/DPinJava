import com.example.abst.UserRepository;
import com.example.conc.User;
import com.example.conc.UserRepositoryImpl;

import javax.sql.DataSource;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a DataSource object to connect to the database


        // Create a UserRepository object using the JdbcUserRepository implementation
        UserRepository userRepository = new UserRepositoryImpl();

        User user1= userRepository.findById(2);

       System.out.println(user1.getName()+"-"+user1.getEmail());

        User user = new User("Angel", "angle@example.com");
        userRepository.save(user);

        User retrievedUser = userRepository.findById(2);
        System.out.println("Retrieved user: " + retrievedUser.getName());

        List<User> users = userRepository.findAll();
        System.out.println("All users: " + users);
        for (User u:users) {
            System.out.println(u.getName()+"-"+u.getEmail());

        }

        retrievedUser.setName("Jane");
        retrievedUser.setEmail("jane@example.com");
        userRepository.update(retrievedUser);

        userRepository.delete(retrievedUser);


    }
}