package DIP.Unfollowed;

public class MongoDbDatabase {
    
    public void saveToMongoDB(String data){

        System.out.println(
                "Executing MongoDB Query: db.users.insert({name: '"
                        + data + "'});"
        );

    }
}
