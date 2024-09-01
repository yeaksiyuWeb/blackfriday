package com.indev.blackfriday;

import java.util.Map;

public class SalesHistoryPresenter {
    public String print(Map<String, Integer> salesHistory) {
        StringBuilder salesHistoStringBuilder = new StringBuilder();
        for (Map.Entry entry : salesHistory.entrySet()) {
            salesHistoStringBuilder.append(entry.getValue());
            salesHistoStringBuilder.append(":");
            salesHistoStringBuilder.append(entry.getKey());
        }
        return salesHistoStringBuilder.toString();
    }
}
