package org.example.tp3.classes;

public class Circle {
    // Raio do círculo
    // Importante pois é um atributo que define o círculo
    // π * (raio * raio)
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void showRadius() {
        System.out.println("Raio do círculo: " + radius);
    }

    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Área do círculo: " + area);
    }
}
