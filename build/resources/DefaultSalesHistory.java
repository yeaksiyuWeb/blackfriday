package com.indev.blackfriday;

import java.util.HashMap;
import java.util.Map;

public class DefaultSalesHistory implements SalesHistory {
    private Map<String, Integer> salesHistory = new HashMap<>();
    private int salesQuantity = 0;

    public void sales(int sellPackage) {
        salesQuantity += sellPackage;
        salesHistory.put("capsules", salesQuantity);
    }

    public String getHistory() {
        return new SalesHistoryPresenter().print(salesHistory);
    }
}
