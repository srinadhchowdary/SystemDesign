// 2. Adaptee: provides XML data from a raw input

public class XmlDataProvider {
    public String getXmlData(String data){
        
        // Expect data in "name:id" format (e.g. "Alice:42")

        int sep = data.indexOf(':');
        String name = data.substring(0,sep);
        String id = data.substring(sep+1);
        
        return "<user>"
                +"<name>" + name +"</name>"
                +"<id>" + id + "</id>"
                +"</user>";
    }
}
