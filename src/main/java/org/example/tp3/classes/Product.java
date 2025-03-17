package org.example.tp3.classes;

public class Product {
    // Demonstração.
    public String name;
    public double Price;
    public int quantityInStock;

    public void updatePrice (double newPrice) {
        Price = newPrice;
    }

    public void updateQuantity (int newQuantity) {
        quantityInStock = newQuantity;
    }

    public void showProduct() {
        System.out.println("Nome do produto: " + name);
        System.out.println("Preço do produto: R$" + Price);
        System.out.println("Quantidade em estoque: " + quantityInStock + " unidades");
    }

    String nameToGet;
    public String getName() {
        return nameToGet;
    }

    double priceToGet;
    public double getPrice() {
        return priceToGet;
    }

    int quantityInStockToGet;
    public int getQuantityInStock() {
        return quantityInStockToGet;
    }

    public void setName(String name) {
        nameToGet = name;
    }

    public void setPrice(double price) {
        priceToGet = price;
    }

    public void setQuantityInStock(int quantityInStock) {
        quantityInStockToGet = quantityInStock;
    }
}
