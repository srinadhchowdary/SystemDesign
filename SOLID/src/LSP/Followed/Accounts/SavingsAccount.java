package LSP.Followed.Accounts;

public class SavingsAccount implements WithDrawAccount{

    private int balance;
    
    public SavingsAccount(){
        this.balance = 0;
    }
    
    @Override
    public void withDraw(double amount) {
        
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Savings Account. New Balance: " + balance);
        }
        else{
            System.out.println("Insufficient funds in Savings Account. Available Balance: " + balance);
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " to Savings Account. New Balance: " + balance);
    }
}
