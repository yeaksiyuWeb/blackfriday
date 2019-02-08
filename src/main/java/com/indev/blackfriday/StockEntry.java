package com.indev.blackfriday;

public class StockEntry {
    private final String id;
    private int quantity;
    private int price;

    public StockEntry(String id, int quantity, int price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public int asset() {
        return (quantity * price);
    }

    public int sell(int sellPackage) {
        if (quantity < sellPackage) {
            return 0;
        }
        quantity -= sellPackage;
        return (sellPackage * price);
    }
}
