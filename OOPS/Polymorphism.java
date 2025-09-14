/*
    - 4th pillar of OOPS - Polymorphism
    - Same method behaves differently in different conditions
    - Type:
         RunTime poly/ Dynamic Poly / Method Overriding 
         CompileTime poly/ Static Poly / Method Overloading

 */

class Vehicle {

    boolean getEngine() {
        return true;
    }
}

class Car extends Vehicle {

    @Override
    boolean getEngine() {
        return false;
    }
}

class Sum {

    int doSum(int a, int b) {
        return a + b;
    }

    int doSum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.getEngine(); // At the runtime it will check which method to call. Method Overriding.

        // Same method names with different parametrs and same return types.Method overloading
        Sum sum = new Sum();
        sum.doSum(1,2);
        sum.doSum(1,2,3);
    }
}
