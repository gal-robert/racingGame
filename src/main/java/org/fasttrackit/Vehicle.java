package org.fasttrackit;

public class Vehicle {

    //class variable
    static int totalCount;

    //instance variable
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(this.name + " is accelerating with " + speed + "km/h for " + durationInHours + "h");

        // local variable (declared inside of method) is not assigned default value;
        double distance = speed * durationInHours;

        //traveledDistance = traveledDistance + distance;
        //shorthand below
        traveledDistance += distance;

        System.out.println("Total traveled distance: " + traveledDistance);

        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel: " + usedFuel);

        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }



}
