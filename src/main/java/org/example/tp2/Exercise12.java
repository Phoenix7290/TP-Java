package org.example.tp2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma sentença ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        int wordCount = words.length;

        System.out.println("A frase contém " + wordCount + " palavras.");

        scanner.close();
    }
}