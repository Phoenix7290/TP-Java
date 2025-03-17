package org.example.tp3;
import org.example.tp3.classes.Product;

public class Exercise05 {
    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Smartphone");
        product.setPrice(1999.99);
        product.setQuantityInStock(10);

        System.out.println("Nome do produto: " + product.getName());
        System.out.println("Preço do produto: R$" + product.getPrice());
        System.out.println("Quantidade em estoque: " + product.getQuantityInStock() + " unidades");

        product.setName("Tablet");
        System.out.println("Nome do produto: " + product.getName());
    }
}
