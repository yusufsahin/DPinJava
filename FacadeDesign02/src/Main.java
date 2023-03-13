import com.example.conc.Authentication;

public class Main {
    public static void main(String[] args) {
        Authentication authentication= new Authentication();
        boolean authenticated=authentication.authenticate("john","password123");
        if(authenticated){
            boolean authorized=authentication.isAuthorized("a6d747a8-bf5c-475d-a9f5-184cde8e91c6", "/customer/orders");
            System.out.println("Authorized: "+authorized);
        }
    }
}