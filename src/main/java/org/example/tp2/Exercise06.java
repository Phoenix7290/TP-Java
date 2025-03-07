package org.example.tp2;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " é um ano bissexto.");
        } else {
            System.out.println(year + " não é um ano bissexto.");
        }
        scanner.close();
    }
}