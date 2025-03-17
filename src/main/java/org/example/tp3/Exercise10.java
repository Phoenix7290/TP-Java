package org.example.tp3;
import org.example.tp3.classes.Circle;
import org.example.tp3.classes.Sphere;

public class Exercise10 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Sphere sphere = new Sphere(10.0);

        circle.showRadius();
        sphere.showRadius();
    }
}
