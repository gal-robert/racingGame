package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // git gud
        System.out.println("Welcome to the Bestest Racing Game");

        // instance variables
        Car carReference = new Car();
        carReference.name = "Dacia";
        carReference.color = "Ultra Blue";
        carReference.mileage = 15.5;
        carReference.fuelLevel = 45.0;
        carReference.doorCount = 2;
        carReference.maxSpeed = 200;
        carReference.running = false;

        // concat
        System.out.println("First Car Name = " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.doorCount);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.running);
        System.out.println(carReference.traveledDistance);

        // second object
        Car car2 = new Car();
        car2.name = "BMW";
        car2.mileage = 11.36;

        System.out.println("\nSecond Car Name = " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.doorCount);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.traveledDistance);

        //overwrite variable in scope

        car2.name = "Yugo";
        System.out.println(car2.name);

        // dupllicate object

        Car car3 = car2;
        car3.name = "Tigaie";

        System.out.println("car3 = " + car3.name);
        System.out.println("car2 = " + car2.name);

//
//        // NullPointerException example
//        Car car4 = null;
//        System.out.println(car4.name);


        //        System.out.println(carReference.name);
    }

}
