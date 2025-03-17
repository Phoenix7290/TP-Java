package org.example.tp3;
import org.example.tp3.classes.Product;

public class Exercise03 {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Notebook";
        product.Price = 2999.99;
        product.quantityInStock = 5;

        product.updatePrice(3499.99);
        product.updateQuantity(10);
        product.showProduct();
    }
}
