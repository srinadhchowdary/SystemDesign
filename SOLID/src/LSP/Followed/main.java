package LSP.Followed;

import LSP.Followed.Accounts.*;

import java.util.*;

public class main {
    
    public static void main(String[] args) {
        
        List<WithDrawAccount> withDrawAccounts = new ArrayList<>();
        List<DepositableAccount> depositableAccounts = new ArrayList<>();
        
        withDrawAccounts.add(new CurrentAccount());
        withDrawAccounts.add(new SavingsAccount());
        
        
        depositableAccounts.add(new FixedTermAccount());
        
        BankClient client = new BankClient(depositableAccounts, withDrawAccounts);
        client.processTransactions();
        
    }
}
