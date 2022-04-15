import controllers.ProductController;
import models.Product;
import views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.


//        Product model = создать экземпляр
        Product product = new Product();
//        SalesView view = создать экземпляр
        SalesView salesView = new SalesView();
//        ProductController controller = создать экземпляр
        ProductController controller = new ProductController(product, salesView);

        // Запуск программы/приложения.

        // Раскомментированный код будет корректным после
        // правильной настройки приложения

         controller.runApp();
    }
}
