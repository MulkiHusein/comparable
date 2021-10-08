package com.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fruitDriver {

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple",100);
        Fruit orange = new Fruit("Orange",50);
        Fruit banana = new Fruit("Banana",50);
        Fruit peach = new Fruit("Peach",100);
        Fruit tangerine = new Fruit("Tangerine",50);
        Fruit apple2 = new Fruit("Apple2",125);

        List<Fruit> fruits = new ArrayList<>();


        fruits.add(apple2);
        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);
        fruits.add(peach);
        fruits.add(tangerine);



        fruits.forEach(System.out::println);

        Collections.sort(fruits);

        fruits.forEach(System.out::println);



    }
}
