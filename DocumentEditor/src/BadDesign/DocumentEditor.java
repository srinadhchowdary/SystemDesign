package BadDesign;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DocumentEditor {
    
    private List<String> documentElements;
    private String renderedDocument;
    
    public DocumentEditor(){
        this.documentElements = new ArrayList<>();
        this.renderedDocument = "";
    }
    
    public void addText(String text){
        documentElements.add(text);
    }
    
    public void addImage(String imagePath){
        documentElements.add(imagePath);
    }
    
    public String renderDocument(){
        if(renderedDocument.isEmpty()){
            StringBuilder result = new StringBuilder();
            for(String element : documentElements){
                if(element.length() > 4 && (element.endsWith(".jpg") || element.endsWith(".png"))){
                    result.append("[image: ").append(element).append("]\n");
                }
                else{
                    result.append(element).append("\n");
                }
            }
            renderedDocument = result.toString();
        }
        return renderedDocument;
    }
    
    public void saveToFile(){
        
        try{
            FileWriter writer = new FileWriter("DocumentEditor.txt");
            writer.write(renderDocument());
            writer.close();
            System.out.println("Document saved to DocumentEditor.txt");
        } catch (IOException e) {
            System.out.println("Error saving document: " + e.getMessage());
        }

    }
    
}
