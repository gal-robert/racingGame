package org.fasttrackit;

public class Vehicle {

    //class variable
    static int totalCount;

    //instance variable
    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
