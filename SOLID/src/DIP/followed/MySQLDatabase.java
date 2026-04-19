package DIP.followed;

public class MySQLDatabase implements Database{
    
    @Override
    public void save(String data) {

        System.out.println(
                "Executing MySQL Query: db.users.insert({name: '"
                        + data + "'});"
        );
        
    }
}
