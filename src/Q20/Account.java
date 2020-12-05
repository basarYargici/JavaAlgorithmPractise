package Q20;

/**
 * Project: DataStructuresMidterm
 * Package: Q20
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 12/2/2020
 * <p>
 * Q20) An Account class stores a current balance, and provides getBalance,
 * deposit, withdraw, and toString methods in addition to at least one
 * constructor. Write and test an Account class. Make sure your withdraw
 * method throws an exception if appropriate.
 */
public class Account {
    private double balance;

    /**
     * This is the constructor of Account class.
     *
     * @param balance This is a double which holds the account balance.
     */
    public Account(double balance) {
        this.balance = balance;
    }

    /**
     * This method returns the balance of account.
     *
     * @return double This is the balance of account.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * This method takes double parameter and add it to account balance.
     *
     * @param money This is the amount of money to deposit.
     */
    public void deposit(double money) {
        System.out.println("\nDeposit Process: \n" + money + " TL will be deposited.");
        System.out.println("Before deposit process balance = " + balance + " TL.");
        balance += money;
        System.out.println("After deposit process balance = " + balance + " TL.");
    }

    /**
     * This method takes double parameter and subtract it from account balance.
     *
     * @param money This is the amount of money to withdraw.
     */
    public void withdraw(double money) {
        System.out.println("\nWithdraw Process: \n" + money + " TL will be withdrawn if there is enough money in account.");
        if (money > balance) {
            //throw new ArithmeticException("Account does not have that much money. Current balance = " + balance+" TL.");
            System.out.println("Account does not have that much money. Current balance = " + balance + " TL.");
        } else {
            balance -= money;
            System.out.println("Deposit process completed! You withdraw : " + money + " TL.\nCurrent balance =" + balance + " TL.");
        }
    }

    /**
     * This method gives information about Account class.
     *
     * @return String This returns string text which shows what class can do.
     */
    public String toString() {
        return "You can learn the current balance with getBalance(), " +
                "deposit money with deposit(amount) and withdraw money with withdraw(amount).";
    }
}

/**
 * This class contains main function.
 */
class Test {
    /**
     * This is the main function which makes use of Account class objects, and methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        Account account = new Account(500);
        System.out.println(account.toString());
        System.out.println("Starting Account Balance = " + account.getBalance() + " TL.");

        account.withdraw(300);
        account.deposit(700);
        account.withdraw(1800);
    }
}