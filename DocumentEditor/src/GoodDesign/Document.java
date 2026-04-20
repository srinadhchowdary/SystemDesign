package GoodDesign;

// Document class responsible for holding a collection of elements

import GoodDesign.Operations.DocumentElement;
import java.util.*;
public class Document {
    
    private List<DocumentElement> documentElements = new ArrayList<>();
    public void addElement(DocumentElement element){
        documentElements.add(element);
    }
    
    public String render(){
        StringBuilder result = new StringBuilder();
        
        for(DocumentElement element : documentElements){
            result.append(element.render());
        }
        return result.toString();
    }
    
}
