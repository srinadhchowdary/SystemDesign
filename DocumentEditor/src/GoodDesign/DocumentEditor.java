package GoodDesign;

import GoodDesign.Operations.ImageElement;
import GoodDesign.Operations.NewLineElement;
import GoodDesign.Operations.TabSpaceElement;
import GoodDesign.Operations.TextElement;
import GoodDesign.Persistence.Persistence;

public class DocumentEditor {
    
    private Document document;
    private Persistence persistence;
    
    private String renderedDocument = "";
    
    public DocumentEditor(Document document , Persistence persistence){
        
        this.document = document;
        this.persistence = persistence;
        
    }
    
    public void addText(String text){
        document.addElement(new TextElement(text));
    }
    
    public void addImage(String imagePath){
        document.addElement(new ImageElement(imagePath));
    }
    
    public void addNewLine(){
        document.addElement(new NewLineElement());
    }
    
    public void addTabSpace(){
        document.addElement(new TabSpaceElement());
    }
    
    public String renderString(){
        if(renderedDocument.isEmpty()){
            renderedDocument = document.render();
        }
        return renderedDocument;
    }
    
    public void saveDocument(){
        persistence.save(renderString());
    }
}
