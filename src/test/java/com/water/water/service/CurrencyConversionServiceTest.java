package com.water.water.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyConversionServiceTest {

    @InjectMocks
    private CurrencyConversionService currencyConversionService;

    @Test
    public void testConvertINRtoUSD() {
        double amountInINR = 160.0;
        double expectedAmountInUSD = 2.0; // 160 / 80 = 2
        double actualAmountInUSD = currencyConversionService.convertINRtoUSD(amountInINR);
        assertEquals(expectedAmountInUSD, actualAmountInUSD, 0.001);
    }
}
