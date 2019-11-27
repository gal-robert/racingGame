package org.fasttrackit;

public class App {
    public static void main(String[] args) {

        Game main = new Game();
        main.start();

        // git gud
        System.out.println("Welcome to the Bestest Racing Game");

        //create engine object
        Engine carEngine = new Engine();
        carEngine.manufacturer = "Renault";
        carEngine.capacity = 2.2;

        // instance variables
        Car carReference = new Car(carEngine);
        carReference.name = "Dacia";
        carReference.color = "Ultra Blue";
        carReference.mileage = 15.5;
        carReference.fuelLevel = 105.0;
        carReference.doorCount = 2;
        carReference.maxSpeed = 200;
        carReference.running = false;

        carReference.engine = carEngine;

        System.out.println("Engine details... \n   " + carReference.engine.manufacturer + "\n   " + carReference.engine.capacity);

        double accelerationDistance = carReference.accelerate(200, 1);
        carReference.accelerate(120, 1);
        System.out.println("Acceleration distance: "+accelerationDistance);
        Mechanic worstMechanicEver = new Mechanic();
        worstMechanicEver.repairVehicle(carReference);
        System.out.println("Total traveled distance after repair: " + carReference.traveledDistance + "\n");


        // concat
        System.out.println("First Car Name = " + carReference.name);

        // second object
        Car car2 = new Car(new Engine());
        car2.engine.manufacturer = "Bavaria Motor Werk";
        car2.engine.capacity = 3.2;
        car2.name = "BMW";
        car2.mileage = 11.36;

        System.out.println("\nSecond Car Name = " + car2.name);

        //overwrite variable in scope

        car2.name = "Yugo";
        System.out.println(car2.name);

        // dupllicate object

        Car car3 = car2;
        car3.name = "Tigaie";

//        // NullPointerException example
//        Car car4 = null;
//        System.out.println(car4.name);



        System.out.println("Studying class variabels (static): ");
        System.out.println("Total vehicle count from Vehicle class: " + Vehicle.totalCount);


    }

}
