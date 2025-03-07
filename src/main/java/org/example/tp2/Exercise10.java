package org.example.tp2;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Eu pensei em um número entre 1 e 100. Tente adivinhar!");

        while (guess != secretNumber) {
            System.out.print("Digite seu palpite: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Seu palpite é menor do que o número secreto.");
            } else if (guess > secretNumber) {
                System.out.println("Seu palpite é maior do que o número secreto.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto!");
                System.out.println("Número de tentativas: " + attempts);
            }
        }

        scanner.close();
    }
}