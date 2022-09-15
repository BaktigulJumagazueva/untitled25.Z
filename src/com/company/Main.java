package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, CarInformation> map = new HashMap<>();
        map.put(new Car(43, 4376), new CarInformation(2020, "Mersedes", 25000, "black"));
        map.put(new Car(87, 9854), new CarInformation(2021, "Honda", 50000, "white"));
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}