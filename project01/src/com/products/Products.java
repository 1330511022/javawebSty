package com.products;

public class Products {
    private String PrductName;
    private int PrductPrice;
    private int PrductNumber;

    public Products(String prductName, int prductPrice, int prductNumber) {
        PrductName = prductName;
        PrductPrice = prductPrice;
        PrductNumber = prductNumber;
    }

    public Products() {
    }

    public String getPrductName() {
        return PrductName;
    }

    public void setPrductName(String prductName) {
        PrductName = prductName;
    }

    public int getPrductPrice() {
        return PrductPrice;
    }

    public void setPrductPrice(int prductPrice) {
        PrductPrice = prductPrice;
    }

    public int getPrductNumber() {
        return PrductNumber;
    }

    public void setPrductNumber(int prductNumber) {
        PrductNumber = prductNumber;
    }
}
