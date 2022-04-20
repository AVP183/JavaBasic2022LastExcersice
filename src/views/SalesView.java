package views;


import models.Product;
import utils.Validator;

import java.util.Scanner;


// View
public class SalesView{

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    Product model;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {
        scanner = new Scanner(System.in);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        title = "Введите наименование товара: ";
        System.out.print(title);
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        model.setName(Validator.validateName(scanner));

        // Здесь, реализуйте вывод сообщения о необходимсоти
        title = "Введите количество: ";
        System.out.print(title);
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        model.setQuantity(Validator.validateQuantityInput(scanner));

        title = "Введите цену: ";
        System.out.print(title);
        model.setPrice(Validator.validatePriceInput(scanner));

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        scanner.close();
    }


    public void getOutput(String output) {
        System.out.println(output);
    }
}