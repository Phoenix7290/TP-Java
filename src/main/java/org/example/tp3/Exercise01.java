package org.example.tp3;
import org.example.tp3.classes.Car;

public class Exercise01 {

    // Classe
    // Uma classe é um modelo para objetos.
    // A classe define características e comportamentos dos objetos que serão criados a partir dela.

    // Objeto
    // Um objeto é uma instância de uma classe.
    // Um objeto é criado a partir de uma classe.

    // Campos (ou atributos)
    // Campos são variáveis da classe que armazenam dados.
    // Campos representam as características dos objetos.

    // Métodos
    // Métodos são funções da classe que definem o comportamento dos objetos.
    // Métodos representam as ações que os objetos podem realizar.

    // Veja um exemplo de uso de classe:

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Fiat";
        car.currentSpeed = 0;

        System.out.println("Marca do carro: " + car.brand);
        System.out.println("Velocidade atual: " + car.currentSpeed + " km/h");

        car.speedUp(20);
    }
}
