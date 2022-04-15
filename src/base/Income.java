package base;

//содержит 2 перегруженных абстрактных метода
//необходимости расчета дохода и чистого дохода
public interface Income {

    //    Доход = Количество товара х Цена.
    //Товар - штучный, т.е. в штуках.
    public double calculateProfit();

    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...
    public double calculateClearProfit();
}
