package LSP.UnFollowed.Accounts;

public class FixedTermAccount implements Account{
    
    private double balance;
    
    public FixedTermAccount(){
        balance = 0;
    }
    
    @Override
    public void deposit(double amount) {
        
        balance += amount;
        System.out.println("Deposited "+ amount + " to Fixed Term Account. Current Balance: "+ balance);
        
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals are not allowed from Fixed Term Account until maturity.");
    }
}
