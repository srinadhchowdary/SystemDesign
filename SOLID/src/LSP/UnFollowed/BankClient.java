package LSP.UnFollowed;

import LSP.UnFollowed.Accounts.Account;

import java.util.List;

public class BankClient {
    
    private List<Account> accounts;
    
    public BankClient(List<Account> accounts){
        this.accounts = accounts;
    }
    
    public void processTransactions(){
        
        for(Account account : accounts){
            account.deposit(1000);
            
            try{
                account.withdraw(500);
            }
            catch (UnsupportedOperationException e){
                System.out.println("Exception :"+ e.getMessage());
            }
        }
        
    }
    
}
