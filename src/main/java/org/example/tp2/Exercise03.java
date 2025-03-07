package org.example.tp2;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valueInReais = scanner.nextDouble();

        System.out.print("Escolha a moeda de destino (dólar, euro ou libra): ");
        String targetCurrency = scanner.next().toLowerCase();

        double exchangeRate;
        switch (targetCurrency) {
            case "dólar":
                exchangeRate = 5.83;
                break;
            case "euro":
                exchangeRate = 6.06;
                break;
            case "libra":
                exchangeRate = 7.35;
                break;
            default:
                System.out.println("Moeda não reconhecida.");
                scanner.close();
                return;
        }

        double convertedValue = valueInReais / exchangeRate;

        System.out.printf("Valor convertido: %.2f %s\n", convertedValue, targetCurrency);

        scanner.close();
    }
}