package models;


import base.Fiscal;
import base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;

    private final int taxRate = 5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public double calculateProfit() {
        return quantity * price;
    }

    @Override
    public double calculateTaxFromSale() {
        return calculateProfit() * taxRate / 100;
    }

    @Override
    public double calculateClearProfit() {
        return calculateProfit() - calculateTaxFromSale();
    }
}