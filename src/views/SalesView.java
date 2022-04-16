package views;



import models.Product;
import utils.Validator;
import java.util.Scanner;


// View
public class SalesView {

    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;


    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {
       this.name = model.getName();
       this.quantity = model.getQuantity();
       this.price = model.getPrice();
    }

    public void getInputs() {
        scanner = new Scanner(System.in);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        title = "Введите наименование товара: ";
        System.out.print(title);
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        name = Validator.validateName(scanner);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        title = "Введите количество: ";
        System.out.print(title);
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        quantity = Validator.validateQuantityInput(scanner);

        title = "Введите цену: ";
        System.out.print(title);
        price = Validator.validatePriceInput(scanner);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        scanner.close();
    }


    public void getOutput(String output) {
        System.out.println(output);
    }
}