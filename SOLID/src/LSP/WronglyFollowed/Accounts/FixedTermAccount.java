package LSP.WronglyFollowed.Accounts;

public class FixedTermAccount implements Account{
    
    private int balance;
    public FixedTermAccount(){
        balance = 0;
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to Fixed Term Account. New Balance: " + balance);
        
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals are not allowed from a Fixed Term Account");
    }
}
