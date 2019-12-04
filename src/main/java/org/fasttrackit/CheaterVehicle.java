package org.fasttrackit;

public class CheaterVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println("\n" + getName() + " is accelerating with " + speed + "km/h for " + durationInHours + "h");

        double distance = 2 * speed * durationInHours;

        setTraveledDistance(getTraveledDistance() + distance);

        System.out.println("Cheater lmao");
        return distance;
    }


    //co-variant return type
    //access cannot be more restrictive than parent method
    @Override
    public CheaterVehicle clone() {
        return new CheaterVehicle();
    }
}
