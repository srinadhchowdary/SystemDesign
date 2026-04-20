package GoodDesign;

import GoodDesign.Persistence.FileStorage;
import GoodDesign.Persistence.Persistence;

public class DocumentEditorClient {
    public static void main(String[] args) {
        
        Document document = new Document();
        Persistence persistence = new FileStorage();
        
        DocumentEditor editor = new DocumentEditor(document,persistence);
        
        editor.addText("Srinadh");
        editor.addNewLine();
        editor.addTabSpace();
        editor.addText("Bejawada");
        editor.addNewLine();
        editor.addText("Software Engineer");
        editor.addNewLine();
        editor.addNewLine();
        editor.addImage("profile.jpg");

        System.out.println(editor.renderString());
        editor.saveDocument();
    }
}
