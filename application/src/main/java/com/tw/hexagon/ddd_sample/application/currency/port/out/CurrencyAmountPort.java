package com.tw.hexagon.ddd_sample.application.currency.port.out;


import com.tw.hexagon.ddd_sample.domain.currency.model.CurrencyAmount;

public interface CurrencyAmountPort {

    CurrencyAmount getExchangeRate(String currency);

}
