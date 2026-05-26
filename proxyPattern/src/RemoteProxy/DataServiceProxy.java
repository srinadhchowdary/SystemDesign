package RemoteProxy;

public class DataServiceProxy implements IDataService{
    
    private RealDataService realDataService;
    
    public DataServiceProxy(){
        realDataService = new RealDataService();
    }
    
    @Override
    public String fetchData() {

        System.out.println("[DataServiceProxy] Connecting to remote service...");
        return realDataService.fetchData();
        
    }
}
