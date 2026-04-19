package DIP.followed;

public class MongoDBDatabase implements Database{
    
    @Override
    public void save(String data) {

        System.out.println(
                "Executing MongoDB Query: db.users.insert({name: '"
                        + data + "'});"
        );
        
    }
}
