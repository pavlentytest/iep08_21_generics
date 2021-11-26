package ru.samsung.itschool.mdev;

public class Car<T> {
    private String name;
    private int year;
    private T model;

    public Car(String name, int year, T model) {
        this.name = name;
        this.year = year;
        this.model = model;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
