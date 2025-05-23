package com.water.water.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionService {

    private static final double INR_TO_USD_RATE = 80.0;

    public double convertINRtoUSD(double amountInINR) {
        return amountInINR / INR_TO_USD_RATE;
    }
}
