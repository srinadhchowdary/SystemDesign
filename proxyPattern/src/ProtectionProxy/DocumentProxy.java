package ProtectionProxy;

public class DocumentProxy implements IDocumentReader {
    
    private RealDocumentReader realReader;
    private User user;
    
    public DocumentProxy(User user){
        this.realReader = new RealDocumentReader();
        this.user = user;
    }
    @Override
    public void unlockPDF(String filePath, String password) {
        
        if(!user.premiumMemberShip){
            System.out.println("[DocumentProxy] Access Denied. Only premium members can unlock PDFs");
            return;
        }
        realReader.unlockPDF(filePath,password);
        
    }
}
