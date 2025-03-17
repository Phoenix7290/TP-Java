package org.example.tp3.classes;

public class ProductConstructor {
    String nameToConstructor;
    double priceToConstructor;
    int quantityInStockToConstructor;

    public ProductConstructor(String nameToConstructor, double priceToConstructor, int quantityInStockToConstructor) {
        this.nameToConstructor = nameToConstructor;
        this.priceToConstructor = priceToConstructor;
        this.quantityInStockToConstructor = quantityInStockToConstructor;
    }

    public void showProductConstructor() {
        System.out.println("Nome do produto: " + nameToConstructor);
        System.out.println("Preço do produto: R$" + priceToConstructor);
        System.out.println("Quantidade em estoque: " + quantityInStockToConstructor + " unidades");
    }
}
