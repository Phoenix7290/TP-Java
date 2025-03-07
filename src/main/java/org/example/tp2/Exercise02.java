package org.example.tp2;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            double grade1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double grade2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double grade3 = scanner.nextDouble();

            System.out.print("Digite a quarta nota: ");
            double grade4 = scanner.nextDouble();

            double average = (grade1 + grade2 + grade3 + grade4) / 4;

            System.out.println("\nMédia: " + average);

            if (average >= 7) {
                System.out.println("Você foi aprovado!");
            } else if (average >= 5) {
                System.out.println("Você está em recuperação.");
            } else {
                System.out.println("Você foi reprovado.");
            }

            scanner.close();
    }
}
