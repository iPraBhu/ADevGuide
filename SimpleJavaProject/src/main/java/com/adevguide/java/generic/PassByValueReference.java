package com.adevguide.java.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author PraBhu
 *
 */

public class PassByValueReference {

    public static void main(String[] args) {
        System.out.println("Primitives Example");
        System.out.println("-------------------------------------------------------------------------------------");
        int number = 1;
        System.out.println("Main Method before change: " + number);
        change(number);
        System.out.println("Main Method after change: " + number);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Object Swap Example");
        System.out.println("-------------------------------------------------------------------------------------");
        Vehicle car = new Vehicle("4-Wheeler", "Mercedes G", "Black");
        Vehicle bike = new Vehicle("2-Wheeler", "Yamaha FZS", "Yellow-Green");

        System.out.println("Before the Swap: ");
        System.out.println("Car(v1) name: " + car.getName());
        System.out.println("Bike(v2) Color: " + bike.color);
        swap(car, bike);

        System.out.println("After the Swap: ");
        System.out.println("Car(v1) name: " + car.getName());
        System.out.println("Bike(v2) Color: " + bike.color);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Object Change Example");
        System.out.println("-------------------------------------------------------------------------------------");
        Vehicle oldCar = car;
        Vehicle oldBike = bike;

        System.out.println("Before the change: ");
        System.out.println("Car(v1) is:  " + car.toString());
        System.out.println("Bike(v2) Color: " + bike.toString());
        change(car, bike);

        System.out.println("After the change: ");
        System.out.println("Car(v1) is: " + car.toString());
        System.out.println("Bike(v2) is: " + bike.toString());

        System.out.println(oldCar == car); // true
        System.out.println(oldBike == bike); // true

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Map and List Example");
        System.out.println("-------------------------------------------------------------------------------------");
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("A", 1);
        map.put("B", 2);

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);

        System.out.println("map Before the Change(): " + map);
        System.out.println("list Before the Change(): " + list);

        change(map, list);

        System.out.println("map After the Change(): " + map);
        System.out.println("list After the Change(): " + list);

    }

    public static void change(Map m1, List l1) {
        m1.put("C", 3);
        l1.add(30);

        Map<String, Integer> newMap = new HashMap<String, Integer>();

        newMap.putAll(m1);
        newMap.put("D", 4);

        List<Integer> newList = new ArrayList<Integer>();
        newList.addAll(l1);
        newList.add(40);

        Map<String, Integer> lastMap = m1;
        List<Integer> lastList = l1;

        lastMap.remove("A");
        lastList.remove(0);

        System.out.println("Inside Change Method:");
        System.out.println("m1 is: " + m1);
        System.out.println("newMap is : " + newMap);
        System.out.println("lastMap is : " + lastMap);

        System.out.println("l1 is : " + l1);
        System.out.println("newList is : " + newList);
        System.out.println("lastList is : " + lastList);

    }

    public static void swap(Vehicle v1, Vehicle v2) {

        Vehicle temp = v1; // Creating Temp Vehicle object
        v1 = v2; // Swapping v1 and v2
        v2 = temp;

        System.out.println("Inside swap: v1 color: " + v1.getName());
        System.out.println("Inside swap: v2 color: " + v2.getName());

    }

    public static void change(Vehicle v1, Vehicle v2) {

        v1.setName("Honda Jazz"); // v1 is pointing towards car

        Vehicle temp = v1; // Creating Temp Vehicle object

        v2.setName("Pulsur"); //// v1 is pointing towards bike
        v1 = v2; // Swapping v1 and v2
        v1.color = "Green"; // v1 is pointing towards bike
        v2 = temp; // v2 is pointing towards car
        v2.color = "red"; //// v1 is pointing towards car

        System.out.println("Inside swap: v1 is: " + v1.toString());
        System.out.println("Inside swap: v2 is: " + v2.toString());

    }

    public static void change(int number) {

        number = 10;

        System.out.println("Change Method: " + number);

    }

}

class Vehicle {
    private String type;
    private String name;
    String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String type, String name, String color) {
        this.type = type;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", name=" + name + ", color=" + color + "]";
    }

}
