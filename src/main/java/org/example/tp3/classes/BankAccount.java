package org.example.tp3.classes;

public class BankAccount {
    public String accountHolder;
    public int accountNumber;
    public String agency;
    public double balance;
    public String dateOfCreation;

    public void showBankAccount() {
        System.out.println("Titular da conta: " + accountHolder);
        System.out.println("Número da conta: " + accountNumber);
        System.out.println("Agência: " + agency);
        System.out.println("Saldo: R$" + balance);
        System.out.println("Data de criação da conta: " + dateOfCreation);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void calculateYield() {
        balance += balance * 0.01;
    }
}
