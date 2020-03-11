package com.muletraining;

public class TaxCalculator {

    private Double percentBaseTax = 7.0;

    public Double calculateTax(Double price, Integer percentAdditionalTax) {
        return price * (this.percentBaseTax + percentAdditionalTax) / 100;
    }

    public Boolean isTaxFree(Double price) {
        if (price < 10) {
            return true;
        }
        return false;
    }
}