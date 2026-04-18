package LSP.WronglyFollowed.Accounts;

public class SavingsAccount implements Account{
    
    
    private int balance;
    public SavingsAccount(){
        balance = 0;
    }
    
    @Override
    public void deposit(double amount) {
        
        balance += amount;
        System.out.println("Deposited " + amount + " to Savings Account. New Balance: " + balance);
        
    }

    @Override
    public void withdraw(double amount) {
        
        if(balance >= amount){
            System.out.println("Withdrew " + amount + " from Savings Account. New Balance: " + (balance - amount));
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds in Savings Account. Withdrawal failed.");
        }
    }
}
