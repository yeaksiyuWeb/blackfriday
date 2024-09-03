package com.indev.blackfriday;

public class SalesHistoryProxy implements SalesHistory {

    private SalesHistory salesHistory;

    public void sales(int sellPackage) {
        if (sellPackage == 0) {
            return;
        }
        if (salesHistory == null) {
            salesHistory = new DefaultSalesHistory();
        }
        salesHistory.sales(sellPackage);
    }

    public String getHistory() {
        if (salesHistory == null) {
            return "";
        }
        return salesHistory.getHistory();
    }
}
