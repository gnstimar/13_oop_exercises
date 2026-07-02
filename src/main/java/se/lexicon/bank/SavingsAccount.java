package se.lexicon.bank;

public class SavingsAccount extends Account {
    private final double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void processMonth() {
        double interest = getBalance() * interestRate/100;
        deposit(interest);
        IO.println("Holder: " + super.getHolder() + " interest credited");
    }
}
