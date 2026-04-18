package LSP.UnFollowed.Accounts;

public class CurrentAccount implements Account{
    
    private int balance = 0;
    
    public CurrentAccount(){
        balance = 0;
    }
    
    @Override
    public void deposit(double amount) {
        
        balance += amount;
        System.out.println("Deposited "+ amount + " to Current Account. Current Balance: "+ balance);
    }

    @Override
    public void withdraw(double amount) {
        
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrew "+ amount + " from Current Account. Current Balance: "+ balance);
        }
        else{
            System.out.println("Insufficient funds in Current Account. Current Balance: "+ balance);
        }

    }
}
