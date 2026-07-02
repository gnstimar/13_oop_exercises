package se.lexicon.bank;

public class Main {
    void main() {
        // 1. Create a bank named "Lexicon Bank"
        Bank lexicon = new Bank("Lexicon Bank");

        // 2. Add a savings account (1000 kr, 2% rate), a checking account (500 kr, 25 kr fee), and a loan account (5000 kr, 3% rate)
        Account saving = new SavingsAccount("Lexicon", 1000, 2);
        Account checking = new CheckingAccount("Lexicon", 500, 25);
        Account loan = new LoanAccount("Lexicon", 5000, 3);
        lexicon.addAccount(saving);
        lexicon.addAccount(checking);
        lexicon.addAccount(loan);

        // 3. Call printAllSummaries() — print the starting balances
        lexicon.printAllSummaries();
        IO.println();

        // 4. Call processAllAccounts() — each account applies its own month-end rule
        lexicon.processAllAccounts();
        IO.println("--- After one month ----");
        // 5. Call printAllSummaries() again — show the updated balances
        lexicon.printAllSummaries();
    }
}
