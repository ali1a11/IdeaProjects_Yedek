package day_31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Jack Stillwater", 123456789);

        account1.deposit(1000);
        account1.checkBalance(); // Your available balance is: 1000.0

        account1.withdraw(100); // Your available balance is: 900.0
        account1.checkBalance();

        //----------------------------------------

        BankAccount account2 = new BankAccount();
        account2.setInfo("Karen Black", 113555687);

        account2.deposit(500);
        account2.checkBalance(); // Your available balance is: 500.0

    }
}
