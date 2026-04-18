package LSP.UnFollowed.Accounts;

public class SavingsAccount implements Account{
    
    private int balance;
    
    public SavingsAccount(){
        balance = 0;
    }
    
    @Override
    public void deposit(double amount) {
        
        balance += amount;
        System.out.println("Deposited "+ amount + " to Savings Account. Current Balance: "+ balance);
        
    }

    @Override
    public void withdraw(double amount) {
        
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrew "+ amount + " from Savings Account. Current Balance:); "+ balance);
        }
        else{
            System.out.println("Insufficient funds in Savings Account. Current Balance: "+ balance);
        }
    }
}
