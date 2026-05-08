public class AdapterPattern {
    public static void main(String[] args) {
        
        // 1. Create the adaptee
        
        XmlDataProvider xmlDataProvider = new XmlDataProvider();
        
        // 2. Make our adapter
        IReports adapter = new XmlDataProviderAdapter(xmlDataProvider);

        // 3. Give it some raw data
        String rawData = "Alice:42";

        // System.out.println(adapter.getJsonData(rawData));

        // 4. Client prints the JSON
        Client client = new Client();
        client.getReport(adapter,rawData);
        
    }
}