package se.lexicon.bank;

public class LoanAccount extends Account {
    private double loanRate;

    public LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    @Override
    public void processMonth() {
        double loan = getBalance() * loanRate;
        deposit(loan);
        IO.println("Holder: " + super.getHolder() + " loan interest added.");
    }
}
