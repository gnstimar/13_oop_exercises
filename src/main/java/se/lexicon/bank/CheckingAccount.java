package se.lexicon.bank;

public class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void processMonth() {
        withdraw(monthlyFee);
        IO.println("Holder: " + super.getHolder() + " get " + monthlyFee + " kr monthly fee charged.");
    }
}
