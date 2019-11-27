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
        System.out.println("\n" + this.name + " is accelerating with " + speed + "km/h for " + durationInHours + "h");

        if(speed > maxSpeed) {
            System.out.println("Sorry, maximum speed exceeded!");
            return 0;
        } else if (speed == maxSpeed){
            System.out.println("Running at max speed!");
        } else {
            System.out.println("valid speed entered.");
        }

        if (fuelLevel <= 0) {
            System.out.println("You're outta fuel fool!");
            return 0;
        }

        double mileageMultiplier = 1;
        if (speed >= 120) {
            System.out.println("You're going over 120km/h. You'll use more fuel");

            //increasing mileage multiplier according to current accelerating speed
            // ex: 120 / 100 = 1.2 * mileage @ usedFuelWithCurrentMileage
            mileageMultiplier = speed / 100;

        }

        // local variable (declared inside of method) is not assigned default value;
        double distance = speed * durationInHours;

        //traveledDistance = traveledDistance + distance;
        //shorthand below
        traveledDistance += distance;

        System.out.println("Total traveled distance: " + traveledDistance);

        double usedFuelWithStandardMileage = distance * mileage / 100;
        double usedFuelWithCurrentMileage = distance * mileage / 100 * mileageMultiplier;
        System.out.println("Used fuel with standard mileage: " + usedFuelWithStandardMileage);
        System.out.println("Used fuel calculated mileage: " + usedFuelWithCurrentMileage);

        fuelLevel -= usedFuelWithCurrentMileage;
        System.out.println("Remaining fuel: " + fuelLevel + "\n");

        return distance;
    }



}
