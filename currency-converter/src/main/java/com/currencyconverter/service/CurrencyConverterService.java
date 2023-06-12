package com.currencyconverter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.currencyconverter.model.CurrencyData;

import reactor.core.publisher.Mono;

@Service
public class CurrencyConverterService {

    private final WebClient client;

    public CurrencyConverterService(WebClient.Builder webClientBuilder) {
        this.client = webClientBuilder
            .baseUrl("https://currency-converter-by-api-ninjas.p.rapidapi.com")
            .defaultHeader("X-RapidAPI-Key", "de15e63f8emshcce663e2811d74cp1debe9jsn52245d3bc818")
            .defaultHeader("X-RapidAPI-Host", "currency-converter-by-api-ninjas.p.rapidapi.com")
            .build();
    }

    public Mono<CurrencyData> convertCurrency(String have, String want, int amount) {
        return this.client.get()
            .uri(uriBuilder -> uriBuilder
                .path("/v1/convertcurrency")
                .queryParam("have", have)
                .queryParam("want", want)
                .queryParam("amount", amount)
                .build())
            .retrieve()
            .bodyToMono(CurrencyData.class);
    }
}
