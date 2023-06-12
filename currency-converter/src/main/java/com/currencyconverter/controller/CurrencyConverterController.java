package com.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currencyconverter.model.CurrencyData;
import com.currencyconverter.service.CurrencyConverterService;

import reactor.core.publisher.Mono;

@RestController
public class CurrencyConverterController {
    @Autowired
    private CurrencyConverterService currencyConverterService;

     @GetMapping("/convert/{have}/{want}/{amount}")
    public Mono<CurrencyData> convertCurrency(@PathVariable String have, @PathVariable String want, @PathVariable int amount) {
        return this.currencyConverterService.convertCurrency(have, want, amount);
    }
}
