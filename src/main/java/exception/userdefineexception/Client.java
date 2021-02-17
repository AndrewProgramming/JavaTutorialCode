package exception.userdefineexception;

public class Client {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(100);
        try {
            checkAccount.withdraw(200);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, you lack " + e.getAmount());
            e.printStackTrace();
        }

    }
}
