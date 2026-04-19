package LSP.Followed.Accounts;

public class CurrentAccount implements WithDrawAccount{
    private int balance;
    
    public CurrentAccount(){
        this.balance = 0;
    }
    
    @Override
    public void withDraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Current Account. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Current Account. Available Balance: " + balance);
        }
    }

    @Override
    public void deposit(double amount) {
        
        balance += amount;
        System.out.println("Deposited: " + amount + " to Current Account. New Balance: " + balance);

    }
}
