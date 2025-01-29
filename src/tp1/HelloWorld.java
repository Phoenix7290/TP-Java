package tp1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Exercise 9 part 1
        Scanner sc = new Scanner(System.in);

        // Exercise 8
        int numberInt = 2;
        long numberLong = 2L;
        double numberDouble = 2.0;
        char character = 'A';
        String characterString = "A String";

        // Exercise 4
        System.out.println("Hello, World!");

        // Exercise 7
        System.out.println("I am Phoenix7290");
        System.out.println("28/01");

        // Exercise 8
        System.out.println(numberInt);
        System.out.println(numberLong);
        System.out.println(numberDouble);
        System.out.println(character);
        System.out.println(characterString);

        // Exercise 9 part 2
        System.out.println("Digite seu nome");
        String name = sc.nextLine();
        System.out.println("Digite sua idade");
        int age = sc.nextInt();
        System.out.println("Nome: " + name + ", Idade: " + age);

        // Exercise 10 (Copy)
        // System.out.println(Hello, World!);
        // System.out.println(numberInteger);
        // System.out.println("Nome: "  name  ", Idade: "  age);
    }
}
