package com.cq.springcloud.model;

public class Order {
    private String tradeacco;
    private String indexCode;
    private int quantity;
    private double price;
    private int successQuantity;

    public String getIndexCode() {
        return indexCode;
    }

    public void setIndexCode(String indexCode) {
        this.indexCode = indexCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSuccessQuantity() {
        return successQuantity;
    }

    public void setSuccessQuantity(int successQuantity) {
        this.successQuantity = successQuantity;
    }

    public String getTradeacco() {
        return tradeacco;
    }

    public void setTradeacco(String tradeacco) {
        this.tradeacco = tradeacco;
    }
}
