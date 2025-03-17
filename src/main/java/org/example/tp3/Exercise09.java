package org.example.tp3;
import org.example.tp3.classes.BankAccount;

public class Exercise09 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 100000;
        account.accountHolder = "Jonathan";
        account.agency = "1234-5";
        account.balance = 2000.00;
        account.dateOfCreation = "01/01/2021";

        account.withdraw(500.00);
        account.deposit(1000.00);
        account.calculateYield();
        account.showBankAccount();
    }
}
