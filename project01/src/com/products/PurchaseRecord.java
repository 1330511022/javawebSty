package com.products;

public class PurchaseRecord {
    private String purchaseDate;
    private String productName;
    private double productPrice;
    private String username;

    public PurchaseRecord(String purchaseDate, String productName, double productPrice, String username) {
        this.purchaseDate = purchaseDate;
        this.productName = productName;
        this.productPrice = productPrice;
        this.username = username;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
