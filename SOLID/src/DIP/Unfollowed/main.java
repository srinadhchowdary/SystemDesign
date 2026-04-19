package DIP.Unfollowed;

public class main {

    public static void main(String[] args) {
        
        UserService userService = new UserService();  
        userService.saveUserToMySQL("srinadh");
        userService.saveUserToMongoDB("bejawada");
        
    }
}
