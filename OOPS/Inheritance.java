/*
    3rd Pillar of OOPS- Inheritance.
    Capability of a class to inherit properties from thier parent.
    Can be achieved via extends keyword or using inheritance.
    Type: Single level, multi level, hierarical and multiple => Not supported by java but can be implemeted using interface. 
 */

class Vehicle {

    boolean engine;

    boolean getEngine() {
        return this.engine;
    }
}

class Car extends Vehicle {

    String type;

    String getCarType() {
        return this.type;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.getEngine();
        car1.getCarType();
    }
}   
