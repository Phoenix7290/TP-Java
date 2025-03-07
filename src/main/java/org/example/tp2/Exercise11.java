package org.example.tp2;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int initialValue = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int increment = scanner.nextInt();

        System.out.println("Sequencia:");

        for (int i = initialValue; i <= 100; i += increment) {
            System.out.print(i);
            if (i + increment <= 100) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}