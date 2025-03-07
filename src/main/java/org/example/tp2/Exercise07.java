package org.example.tp2;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário bruto anual: R$ ");
        double annualGrossSalary = scanner.nextDouble();

        double tax;
        double netSalary;

        if (annualGrossSalary <= 22847.76) {
            tax = 0;
        } else if (annualGrossSalary <= 33919.80) {
            tax = annualGrossSalary * 0.075;
        } else if (annualGrossSalary <= 45012.60) {
            tax = annualGrossSalary * 0.15;
        } else if (annualGrossSalary <= 55976.16) {
            tax = annualGrossSalary * 0.225;
        } else {
            tax = annualGrossSalary * 0.275;
        }

        netSalary = annualGrossSalary - tax;

        System.out.printf("Imposto de renda a pagar: R$ %.2f%n", tax);
        System.out.printf("Salário líquido: R$ %.2f%n", netSalary);

        scanner.close();
    }
}