package LSP.WronglyFollowed;

import LSP.WronglyFollowed.Accounts.Account;
import LSP.WronglyFollowed.Accounts.FixedTermAccount;

import java.util.List;

public class BankClient {
    
    List<Account> accounts;
    
    public BankClient(List<Account> accounts){
        this.accounts = accounts;
    }
    
    public void processTransactions(){
        for(Account account:accounts){
            account.deposit(1000);
            if(account instanceof FixedTermAccount){
                System.out.println("Cannot Withdraw from a Fixed Term Account");
            }
            else{
                try{
                    account.withdraw(500);
                }
                catch(UnsupportedOperationException e){
                    System.out.println("Withdrawal not supported for this account type");
                }
            }
        }
    }
}