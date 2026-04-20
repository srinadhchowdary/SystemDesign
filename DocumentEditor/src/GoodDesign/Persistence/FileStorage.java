package GoodDesign.Persistence;

import java.io.FileWriter;
import java.io.IOException;

public class FileStorage implements Persistence{
    
    @Override
    public void save(String data) {
        
        try{
            FileWriter outFile = new FileWriter("DocumentEditorGoodDesign.txt");
            outFile.write(data);
            outFile.close();
            System.out.println("Document saved to file DocumentEditorGoodDesign.txt");
        } catch (IOException e) {
            System.out.println("Error : Unable to open file for writing.");
        }

    }
}
