package org.example.tp2;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloque o seu dia de nascimento: ");
        int birthDay = scanner.nextInt();

        System.out.print("Coloque o seu mes de nascimento: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Coloque o seu ano de nascimento: ");
        int birthYear = scanner.nextInt();

        int daysLived = calculateDaysLived(birthDay, birthMonth, birthYear);

        System.out.println("Voce viveu " + daysLived + " dias.");

        scanner.close();
    }

    public static int calculateDaysLived(int day, int month, int year) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(year, month, day);

        return (int) java.time.temporal.ChronoUnit.DAYS.between(birthDate, currentDate);
    }
}