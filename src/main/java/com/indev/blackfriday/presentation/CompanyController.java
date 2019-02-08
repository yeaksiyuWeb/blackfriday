package com.indev.blackfriday.presentation;


import com.indev.blackfriday.StockEntry;
import com.indev.blackfriday.business.StockService;

import java.util.List;

public class CompanyController {


    //@Autowired
    private StockService stockService;
    //@Path("/stocks")
    //@Produces("application/json")
    public List<StockEntry> listStock() {
        return stockService.getAll();
    }
}
