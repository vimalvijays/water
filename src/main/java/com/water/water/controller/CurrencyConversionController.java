package com.water.water.controller;

import com.water.water.service.CurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class CurrencyConversionController {

    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/inr-to-usd")
    public double convertINRtoUSD(@RequestParam double amountInINR) {
        return currencyConversionService.convertINRtoUSD(amountInINR);
    }
}
