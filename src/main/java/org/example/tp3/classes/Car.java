package org.example.tp3.classes;

public class Car {
    public String brand;
    public int currentSpeed;

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Velocidade atual após aceleração: " + currentSpeed + " km/h");
    }
}
