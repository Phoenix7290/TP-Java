package org.example.tp3.classes;

public class Sphere {
    // Raio da esfera
    // Importante pois é um atributo que define a esfera
    // (4.0 / 3.0) * π * (raio * raio * raio)
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void showRadius() {
        System.out.println("Raio da esfera: " + radius);
    }

    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume da esfera: " + volume);
    }

    public void calculateArea() {
        double area = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Área da esfera: " + area);
    }
}
