package day_31_Constructor;
/*
BankAccount Task:

Attributes: 1. accountHolder, 2. accountNumber, 3. balance

Actions:
1. setInfo(): sets the accountHolder and accountNumber attributes
2. toString()
3. checkBalance():displays the available balance
4. deposit(): increases the balance by the given amount
5. withdraw(): decreases the balance by the given amount

 */

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo (String accountHolder, long accountNumber){ // do not need balance here
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount) {
        if(amount<=0) {
            System.out.println("Invalid amount");
            return; // exits the method
        }
        balance += amount;
    }

    public void withdraw (double amount){
        if(amount<=0) { // if amount negative or zero
            System.out.println("Invalid amount");
            return; // exits the method
        }

        if (amount>balance){ // if amount is greater than available balance
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }
}
