package LSP.Followed;

import LSP.Followed.Accounts.DepositableAccount;
import LSP.Followed.Accounts.WithDrawAccount;

import java.util.List;

public class BankClient {
    
    private List<DepositableAccount> depositableAccounts;
    private List<WithDrawAccount> withDrawAccounts;
    
    public BankClient(List<DepositableAccount> depositableAccounts,List<WithDrawAccount> withDrawAccounts){
        this.depositableAccounts = depositableAccounts;
        this.withDrawAccounts = withDrawAccounts;
    }
    
    public void processTransactions(){
        
        for(WithDrawAccount account : withDrawAccounts){
            account.deposit(1000);
            account.withDraw(500);
        }
        for(DepositableAccount account : depositableAccounts){
            account.deposit(5000);
        }
    }
}
