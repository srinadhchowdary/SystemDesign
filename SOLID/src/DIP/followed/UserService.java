package DIP.followed;

import javax.xml.crypto.Data;

public class UserService {
    
    private final Database db;
    
    public UserService(Database db){
        this.db = db;
    }
    
    public void storeUser(String user){
        db.save(user);
    }
}
