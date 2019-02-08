package com.indev.blackfriday.business;

import com.indev.blackfriday.StockEntry;

import java.util.ArrayList;
import java.util.List;

public class StockService {
    List<StockEntry> stockEntries = new ArrayList<>();

    public List<StockEntry> getAll() {
        return stockEntries;
    }
}
