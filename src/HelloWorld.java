import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberInt = 2;
        long numberLong = 2L;
        double numberDouble = 2.0;
        char character = 'A';
        String characterString = "A String";

        System.out.println("Hello, World!");
        System.out.println("I am Phoenix7290");
        System.out.println("28/01");
        System.out.println(numberInt);
        System.out.println(numberLong);
        System.out.println(numberDouble);
        System.out.println(character);
        System.out.println(characterString);
        System.out.println("Digite seu nome");
        String name = sc.nextLine();
        System.out.println("Digite sua idade");
        int age = sc.nextInt();
        System.out.println("Nome: " + name + ", Idade: " + age);
    }
}
