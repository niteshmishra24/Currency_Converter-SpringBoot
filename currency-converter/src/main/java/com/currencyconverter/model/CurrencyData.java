package com.currencyconverter.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyData {

    private double new_amount;
    private String new_currency;
    private String old_currency;
    private double old_amount;
    
    public double getNew_amount() {
        return new_amount;
    }
    public void setNew_amount(double new_amount) {
        this.new_amount = new_amount;
    }
    public String getNew_currency() {
        return new_currency;
    }
    public void setNew_currency(String new_currency) {
        this.new_currency = new_currency;
    }
    public String getOld_currency() {
        return old_currency;
    }
    public void setOld_currency(String old_currency) {
        this.old_currency = old_currency;
    }
    public double getOld_amount() {
        return old_amount;
    }
    public void setOld_amount(double old_amount) {
        this.old_amount = old_amount;
    }
    public CurrencyData(double new_amount, String new_currency, String old_currency, double old_amount) {
        this.new_amount = new_amount;
        this.new_currency = new_currency;
        this.old_currency = old_currency;
        this.old_amount = old_amount;
    }
    public CurrencyData() {
    }

    
}
