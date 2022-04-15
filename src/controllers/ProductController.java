package controllers;

import models.Product;
import views.SalesView;

// Controller
public class ProductController {

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


        // 4) вывод расчетов по заданному формату.

        String output = "Наименование товара: " + model.getName() + "\n"
                + "Общий доход (грн.): " + model.calculateProfit() + "\n"
                + "Сумма налога (грн.): " + model.calculateTaxFromSale() + "\n"
                + "Чистый доход (грн.): " + model.calculateClearProfit();

        view.getOutput(output);
    }


}
