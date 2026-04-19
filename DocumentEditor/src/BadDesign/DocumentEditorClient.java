package BadDesign;

public class DocumentEditorClient {
    public static void main(String[] args) {
        DocumentEditor editor =  new DocumentEditor();
        editor.addText("Hello, World!");
        editor.addImage("picture.jpg");
        editor.addText("This is a document editor.");

        System.out.println("Rendered Document:\n" + editor.renderDocument());
        editor.saveToFile();
    }
}