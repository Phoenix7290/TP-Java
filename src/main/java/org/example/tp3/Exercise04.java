package org.example.tp3;
import org.example.tp3.classes.Product;

public class Exercise04 {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Tablet";
        product.Price = 999.99;
        product.quantityInStock = 3;

        product.updatePrice(799.99);
        product.updateQuantity(5);
        product.showProduct();
    }
}
