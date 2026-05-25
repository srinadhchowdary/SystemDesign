package ProtectionProxy;

public class protectionProxy {
    public static void main(String[] args) {
        
        User user1 = new User("Alice",false);
        User user2 = new User("Bob",true);

        System.out.println("== Alice (Non-Premium) tries to unlock PDF ==");
        IDocumentReader docReader = new DocumentProxy(user1);
        docReader.unlockPDF("sample.pdf","secret123");

        System.out.println("\n== Bob (Premium) tries to unlock PDF ==");
        docReader = new DocumentProxy(user2);
        docReader.unlockPDF("sample.pdf","secret123");
        
        
    }
}
