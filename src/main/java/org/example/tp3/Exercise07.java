package org.example.tp3;
import org.example.tp3.classes.BankAccount;

public class Exercise07 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 123456;
        account.accountHolder = "John Doe";
        account.agency = "1234-5";
        account.balance = 1000.00;
        account.dateOfCreation = "01/01/2021";

        account.showBankAccount();
    }
}
