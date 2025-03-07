package org.example.tp2;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado: ");
        double side1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        double side2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        double side3 = scanner.nextDouble();

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Os lados do triângulo devem ser positivos.");
        } else if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("O triângulo é equilátero.");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não formam um triângulo válido.");
        }

        scanner.close();
    }
}
