package se.lexicon.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        // TODO shall i add extra check here???
        accounts.add(account);
    }

    public void processAllAccounts() {
        for (Account account : accounts) {
            account.processMonth();
        }
    }

    public void printAllSummaries() {
        for (Account account : accounts) {
            account.printSummary();
        }
    }
}
