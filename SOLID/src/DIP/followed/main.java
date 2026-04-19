package DIP.followed;

public class main {

    public static void main(String[] args) {
        
         MySQLDatabase mySQLDatabase = new MySQLDatabase();
         MongoDBDatabase mongoDBDatabase = new MongoDBDatabase();
         
         UserService mysqlservice = new UserService(mySQLDatabase);
         mysqlservice.storeUser("Srinadh");
         
         UserService mongoService = new UserService(mongoDBDatabase);
         mongoService.storeUser("Srinadh");
         
    }
}
