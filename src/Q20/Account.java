package Q20;

/**
 * Project: DataStructuresMidterm
 * Package: Q20
 * <p>
 *
 * @author YARGICI
 * Date 12/2/2020
 * <p>
 * Q20) An Account class stores a current balance, and provides getBalance,
 * deposit, withdraw, and toString methods in addition to at least one
 * constructor. Write and test an Account class. Make sure your withdraw
 * method throws an exception if appropriate.
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double money) {
        System.out.println("\nDeposit Process: \n"+money+" TL will be deposited.");
        System.out.println("Before deposit process balance = " + balance+" TL.");
        balance += money;
        System.out.println("After deposit process balance = " + balance+" TL.");
        return balance;
    }


    public double withdraw(double money) {
        System.out.println("\nWithdraw Process: \n"+money+" TL will be withdrawn if there is enough money in account.");
        if (money > balance) {
            //throw new ArithmeticException("Account does not have that much money. Current balance = " + balance+" TL.");
            System.out.println("Account does not have that much money. Current balance = " + balance+" TL.");
            return 0;
        } else {
            balance -= money;
            System.out.println("Deposit process completed! You withdraw : " + money + " TL.\nCurrent balance =" + balance+" TL.");
        }
        return balance;
    }


    public String toString() {
        return "You can learn the current balance with getBalance(), " +
                "deposit money with deposit(amount) and withdraw money with withdraw(amount).";
    }
}

class Test {
    public static void main(String[] args) {
        Account account = new Account(500);
        System.out.println(account.toString());
        System.out.println("Starting Account Balance = " + account.getBalance()+ " TL.");

        account.withdraw(300);
        account.deposit(700);
        account.withdraw(1800);

    }
}