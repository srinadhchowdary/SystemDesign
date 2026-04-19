package DIP.Unfollowed;

public class UserService {
    
    private final MySQLDatabase mySQLDatabase;
    private final MongoDbDatabase mongoDbDatabase;
    
    public UserService() {
        mySQLDatabase = new MySQLDatabase();
        mongoDbDatabase = new MongoDbDatabase();
    }
    
    public void saveUserToMySQL(String name){
        mySQLDatabase.saveToMySQL(name);
    }
    
    public void saveUserToMongoDB(String name){
        mongoDbDatabase.saveToMongoDB(name);
    }
    
    
}
