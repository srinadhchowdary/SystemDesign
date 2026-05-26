package RemoteProxy;

public class RealDataService implements IDataService{
    
    public RealDataService(){
        System.out.println("[RealDataService] Initialized (simulating remote setup)");
    }
    
    @Override
    public String fetchData() {
        return "[RealDataService] Data from server";
    }
}
