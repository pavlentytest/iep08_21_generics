package ru.samsung.itschool.mdev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add("Test");
        arrayList.add(new Object());

        int a = (int) arrayList.get(1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("100");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",1999));

        ArrayList<Car<String>> cars1 = new ArrayList<>();
        cars1.add(new Car("Toyota",2010,"Camry"));

        ArrayList<School<String, Integer>> schools = new ArrayList<>();
        schools.add(new School<>("Moscow",1329)); // 0
        schools.add(new School<>("Moscow",2086));  // 1 

        int number = schools.get(1).getV();


    }
}
