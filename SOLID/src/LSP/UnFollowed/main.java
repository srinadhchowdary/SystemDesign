package LSP.UnFollowed;

import LSP.UnFollowed.Accounts.Account;
import LSP.UnFollowed.Accounts.CurrentAccount;
import LSP.UnFollowed.Accounts.FixedTermAccount;
import LSP.UnFollowed.Accounts.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
        List<Account> accounts = new ArrayList<>();
        
        accounts.add(new CurrentAccount());
        accounts.add(new SavingsAccount());
        accounts.add(new FixedTermAccount());
        
        BankClient client = new BankClient(accounts);
        client.processTransactions();
        
    }
}
