package utils;
//содержащий статический
//        метод округления значений.
public abstract class Rounder {

    public double rounderValue(double value) {
        return Math.round(value * 100) / 100.0d;
    }
}
