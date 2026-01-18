
package MultiThreading;
class BankAccount {
     int balance = 1000;

   synchronized public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw " + amount);

            balance = balance - amount; // not thread safe

            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " insufficient balance!");
        }
    }
}

public class Sync {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(800), "Person-1");
        Thread t2 = new Thread(() -> account.withdraw(800), "Person-2");

        t1.start();
        t2.start();
    }
}
