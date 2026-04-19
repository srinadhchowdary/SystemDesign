package LSP.Followed.Accounts;

public class FixedTermAccount implements DepositableAccount{
    
    private int balance;
    
    public FixedTermAccount(){
        this.balance = 0;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " to Fixed Term Account. New Balance: " + balance);
    }
}
