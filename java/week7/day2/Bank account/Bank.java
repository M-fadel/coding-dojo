import java.util.*;

public class Bank {
    private double balance;
    private double savings;
    private static int Accounts;
    private static double Total;

    public Bank() {
        this.Accounts++;
    }

    public double getBalance() {
        return balance;
    }

    public double getSavings() {
        return savings;
    }

    public void setBalance(double balance) {
        this.balance += balance;
        this.Total += balance;
    }

    public void setSavings(double savings) {
        this.savings += savings;
        this.Total += savings;
    }

    public static void displayTotal() {
        System.out.println("your total money is " + this.Total);
    }

    public void withdrawbalance(double amount) {
        if (this.balance - amount <= 0) {
            System.out.println("go find a better job");
        } else {
            setBalance((-1 * amount));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<Object>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (Object s : list) {
            System.out.println(s);
            s = 1;
            System.out.println(s);
        }
        System.out.println(list);

        String in = scanner.next();
        System.out.println(in);
    }
}
