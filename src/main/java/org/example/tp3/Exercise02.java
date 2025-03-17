package org.example.tp3;
import org.example.tp3.classes.Product;

public class Exercise02 {
    public static void main(String[] args) {
        // Cada atributo é importante no contexto de um produto.
        // Pois  cada tributo pode ser responsável por:
        // Identificar o produto, definir o preço e quantidade de peças em estoque.

        Product product = new Product();
        product.name = "Smartphone";
        product.Price = 1999.99;
        product.quantityInStock = 10;

        System.out.println("Nome do produto: " + product.name);
        System.out.println("Preço do produto: R$" + product.Price);
        System.out.println("Quantidade em estoque: " + product.quantityInStock + " unidades");
    }
}
