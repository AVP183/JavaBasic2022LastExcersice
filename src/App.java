import views.SalesView;

// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.

        SalesView salesView = new SalesView("Apple", 100, 15);
//        Product model = создать экземпляр
//        SalesView view = создать экземпляр
//        ProductController controller = создать экземпляр

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
        // controller.runApp();
    }
}