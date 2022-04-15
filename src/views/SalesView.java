package views;


import controllers.ProductController;
import models.Product;
import utils.Validator;

import java.util.Scanner;

// View
public class SalesView extends ProductController {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;


    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        System.out.print(title);
        Validator.validateName(scanner);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.


        title = "Введите количество: ";
        System.out.print(title);
        Validator.validateQuantityInput(scanner);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        title = "Введите цену: ";
        System.out.print(title);
        Validator.validatePriceInput(scanner);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
