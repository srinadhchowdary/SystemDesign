package RemoteProxy;

public class RemoteProxy {
    public static void main(String[] args) {
        
        IDataService dataService = new DataServiceProxy();
        dataService.fetchData();
        
    }
}
