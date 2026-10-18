//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(500);
        System.out.println("Balance: " + account.getBalance());

        account.deposit(-100);
        System.out.println("Balance after rejected deposit: "
                + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(400);
        System.out.println("Balance after rejected withdrawal: "
                + account.getBalance());

        account.withdraw(0);
        account.withdraw(-50);

        account.withdraw(300);
        System.out.println("Final balance: " + account.getBalance());
    }
}