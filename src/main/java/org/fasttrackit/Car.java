package org.fasttrackit;

//inheritance or "is-a" relationship
public class Car extends AutoVehicle {

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    //constructor overloading (added multiple constructors with different parameters)
    public Car() {
        this(new Engine());
    }
}
