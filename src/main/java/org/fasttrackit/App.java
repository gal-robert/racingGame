package org.fasttrackit;

public class App {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();
//
//        String a = "test";
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(c));

//        //method implementation taken from object's class not from the variables class
//        //sub-classes can get super class as type
//        Vehicle joker = new JokerVehicle();
//        joker.setName("Joker");
//        joker.setFuelLevel(80);
//
//        //type casting
//        //variable's class determines what methods can be invoked
//        ((JokerVehicle) joker).fly();
//
//        joker.accelerate(60, 1);
//        System.out.println("Joker's total distance: " + joker.getTraveledDistance());
//
//        Car carWithDefaultEngine = new Car();
//
//        // git gud
//        //create engine object
//        Engine carEngine = new Engine();
//        carEngine.manufacturer = "Renault";
//        carEngine.capacity = 2.2;
//
//        // instance variables
//        Car carReference = new Car(carEngine);
//        carReference.setName("Dacia");
//        carReference.setColor("blue");
//        carReference.setMileage(5);
//        carReference.setFuelLevel(100);
//        carReference.setMaxSpeed(255);
//        carReference.setRunning(false);
//        System.out.println(carReference.toString());
//
//        carReference.engine = carEngine;
//
//        System.out.println("Engine details... \n   " + carReference.engine.manufacturer + "\n   " + carReference.engine.capacity);
//
//        double accelerationDistance = carReference.accelerate(200, 1);
//        carReference.accelerate(120);
//        System.out.println("Acceleration distance: "+accelerationDistance);
//
//        Mechanic worstMechanicEver = new Mechanic();
//        worstMechanicEver.repairVehicle(carReference);
//        System.out.println("Total traveled distance after repair: " + carReference.getTraveledDistance() + "\n");
//
//
//        // concat
//        System.out.println("First Car Name = " + carReference.getName());
//
//        // second object
//        Car car2 = new Car(new Engine());
//        car2.engine.manufacturer = "Bavaria Motor Werk";
//        car2.engine.capacity = 3.2;
//        car2.setName("BMW");
//
//        System.out.println("Total vehicle count from Vehicle class: " + Vehicle.totalCount);


    }

}
