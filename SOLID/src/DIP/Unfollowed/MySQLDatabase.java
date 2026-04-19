package DIP.Unfollowed;

public class MySQLDatabase {
    
    public void saveToMySQL(String data){

        System.out.println(
                "Executing MySQL Query: db.users.insert({name: '"
                        + data + "'});"
        );
        
    }
}
