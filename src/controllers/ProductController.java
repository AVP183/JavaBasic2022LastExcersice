package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

public class ProductController extends Rounder{

    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        model.calculateProfit();

        model.calculateTaxFromSale();

        model.calculateClearProfit();

        double profit = rounderValue(model.calculateProfit());

        double taxFromSale = rounderValue(model.calculateTaxFromSale());

        double clearProfit = rounderValue(model.calculateClearProfit());

        String output = "Наименование товара: " + name + "\n"
                + "Общий доход (грн.): " + profit + "\n"
                + "Сумма налога (грн.): " + taxFromSale + "\n"
                + "Чистый доход (грн.): " + clearProfit;

        view.getOutput(output);
    }
}
