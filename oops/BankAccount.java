import java.util.Scanner;

class BankAccount {
    int balance = 1000;

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount deposited Balance = " + balance);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn Balance = " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Balance = " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int dep = sc.nextInt();
                    b.deposit(dep);
                    break;

                case 2:
                    int wit = sc.nextInt();
                    b.withdraw(wit);
                    break;

                case 3:
                    b.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    return;
            }
        }
    }
}