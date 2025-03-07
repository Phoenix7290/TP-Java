package org.example.tp2;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0;
        double finalAmount;

        if (purchaseAmount > 1000) {
            discount = purchaseAmount * 0.10;
        } else if (purchaseAmount >= 500) {
            discount = purchaseAmount * 0.05;
        }

        finalAmount = purchaseAmount - discount;

        System.out.printf("Valor original: R$ %.2f%n", purchaseAmount);
        System.out.printf("Desconto aplicado: R$ %.2f%n", discount);
        System.out.printf("Valor final: R$ %.2f%n", finalAmount);

        scanner.close();
    }
}