package org.fasttrackit;

public class Vehicle {

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;

    public double accelerate(double speed,double durationInHours) {
        System.out.println(this.name + " is accelerating with " + speed + "km/h for " + durationInHours + "h");

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
