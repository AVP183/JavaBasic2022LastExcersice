package views;


import models.Product;
import utils.Validator;
import java.util.Scanner;

public class SalesView{

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    private Product model;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {
        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.print(title);
        model.setName(Validator.validateName(scanner));

        title = "Введите количество: ";
        System.out.print(title);
        model.setQuantity(Validator.validateQuantityInput(scanner));

        title = "Введите цену: ";
        System.out.print(title);
        model.setPrice(Validator.validatePriceInput(scanner));

        scanner.close();
    }


    public void getOutput(String output) {
        System.out.println(output);
    }
}