package LSP.WronglyFollowed.Accounts;

public class CurrentAccount implements Account {
    
    private int balance;
    public CurrentAccount(){
        balance = 0;
    }

    @Override
    public void deposit(double amount) {
        
        balance += amount;
        System.out.println("Deposited " + amount + " to Current Account. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        
        if(balance >= amount){
            System.out.println("Withdrew " + amount + " from Current Account. New Balance: " + (balance - amount));
            balance -= amount;
        }
        else{
            System.out.println("Insufficient funds in Current Account. Withdrawal failed.");
        }
    }
}