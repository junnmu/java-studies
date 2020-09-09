package entities;

// Final na classe impede que ela seja herdada por outra
public final class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    // Exemplo de sobreposição de método
    // Final no método impede que ele seja sobreposto em outra classe
    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}
