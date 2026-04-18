package LSP.WronglyFollowed;

import LSP.WronglyFollowed.Accounts.Account;
import LSP.WronglyFollowed.Accounts.CurrentAccount;
import LSP.WronglyFollowed.Accounts.FixedTermAccount;
import LSP.WronglyFollowed.Accounts.SavingsAccount;

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
