package ProtectionProxy;

public class RealDocumentReader implements IDocumentReader{
    
    
    @Override
    public void unlockPDF(String filePath, String password) {

        System.out.println("[RealDocumentReader] Unlocking PDF at: "+filePath);
        System.out.println("[RealDocumentReader] PDF unlocked successfully with password: "+password);
        System.out.println("[RealDocumentReader] You can now read the PDF content...");
        
    }
}
