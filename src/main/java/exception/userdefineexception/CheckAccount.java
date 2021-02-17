package exception.userdefineexception;

public class CheckAccount {
    private double amount;

    public CheckAccount(double amount) {
        this.amount = amount;
    }

    public double withdraw(double number) throws InsufficientFundsException {
        if (number > this.amount) {
            throw new InsufficientFundsException(number - amount);
        } else {
            return amount - number;
        }
    }
}
