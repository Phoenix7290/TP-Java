package org.example.tp2;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String fullName = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String motherName = scanner.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String fatherName = scanner.nextLine();

        System.out.println("Nome completo: " + fullName);
        System.out.println("Idade: " + age + " anos");
        System.out.println("Nome da mãe: " + motherName);
        System.out.println("Nome do pai: " + fatherName);

        int fullNameLength = fullName.length();
        int motherNameLength = motherName.length();
        int fatherNameLength = fatherName.length();

        if (fullNameLength > motherNameLength && fullNameLength > fatherNameLength) {
            System.out.println("\nSeu nome completo tem mais letras do que o nome da sua mãe e do seu pai.");
        } else if (motherNameLength > fullNameLength && motherNameLength > fatherNameLength) {
            System.out.println("\nO nome da sua mãe tem mais letras do que o seu nome e o nome do seu pai.");
        } else if (fatherNameLength > fullNameLength && fatherNameLength > motherNameLength) {
            System.out.println("\nO nome do seu pai tem mais letras do que o seu nome e o nome da sua mãe.");
        } else {
            System.out.println("\nPelo menos dois nomes possuem o mesmo número de letras.");
        }

        scanner.close();
    }
}