package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;


// Controller
public class ProductController extends Rounder{

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        model.getName();

        // 2) вызов методов расчетов доходов и налога;
        model.calculateProfit();

        model.calculateTaxFromSale();

        model.calculateClearProfit();

        // 3) округление расчетных значений;
        double profit = rounderValue(model.calculateProfit());

        double taxFromSale = rounderValue(model.calculateTaxFromSale());

        double clearProfit = rounderValue(model.calculateClearProfit());

        // 4) вывод расчетов по заданному формату.

        String output = "Наименование товара: " + model.getName() + "\n"
                + "Общий доход (грн.): " + profit + "\n"
                + "Сумма налога (грн.): " + taxFromSale + "\n"
                + "Чистый доход (грн.): " + clearProfit;

        view.getOutput(output);
    }


}
