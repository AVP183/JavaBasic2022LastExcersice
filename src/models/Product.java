package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Income, Fiscal {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;
    // Налоговоу ставку объявите в виде константы
    // здесь ...
    private final int taxRate = 5;
    private double profit;
    private double taxeFromSale;
    private double clearProfit;

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...
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

    // Переопределите методы реализуемых интерфейсов.
    @Override
    public int fiscalCalculate() {
        return 0;
    }

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...
    //    Доход = Количество товара х Цена.
    //Товар - штучный, т.е. в штуках.

    public double calculateProfit() {
        profit = quantity * price;
        return profit;
    }

    // Расчёт суммы налога с продаж.
    // здесь ...
    public double calculateTaxFromSale() {
        taxeFromSale = profit * taxRate;
        return taxeFromSale;
    }

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    public double calculateClearProfit() {
        clearProfit = profit - taxeFromSale;
        return clearProfit;
    }
}
