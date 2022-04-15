package controllers;

import base.Fiscal;
import base.Income;
import models.Product;
import views.SalesView;

// Controller
public class ProductController implements Fiscal, Income {

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
        String name = SalesView.

        // 2) вызов методов расчетов доходов и налога;
        @Override
        public double calculateTaxFromSale () {
            return 0;
        }

        @Override
        public double calculateProfit () {
            return 0;
        }

        @Override
        public double calculateClearProfit () {
            return 0;
        }

        // 3) округление расчетных значений;


        // 4) вывод расчетов по заданному формату.

        String output = "[здесь должен быть вывод по формату]";

        view.getOutput(output);
    }


}
