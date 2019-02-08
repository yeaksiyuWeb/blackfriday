package com.indev.blackfriday;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public static final double NORMAL_MARGIN = 1.2;
    public static final int SELL_PACKAGE = 5;

    List<StockEntry> products = new ArrayList<>();
    private int sellAsset = 0;

    private SalesHistoryProxy salesHistoryProxy = new SalesHistoryProxy();

    public float sells(String capsule) {
        int sellPrice = (int) (products.get(0).sell(SELL_PACKAGE) * NORMAL_MARGIN);
        this.sellAsset += sellPrice;
        salesHistoryProxy.sales(SELL_PACKAGE);

        return sellPrice;
    }

    public void stock(int quantity, String id, int price) {
        products.add(new StockEntry(id, quantity, price));
    }

    public Company to(int i) {
        return this;
    }

    public float computeBenefit() {
        return 0;
    }

    public int totalAssets() {
        int stockAsset = 0;
        for (StockEntry product : products) {
            stockAsset += product.asset();
        }
        return stockAsset + sellAsset;
    }

    public Company blackFriday() {
        return this;
    }

    public String salesHistory() {

        return salesHistoryProxy.getHistory();
    }
}
