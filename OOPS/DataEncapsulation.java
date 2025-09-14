/*
 2nd pillar of OOPS Data Encapsulation.
 Encapsulation is used to hide the implementation part and show the functionality for better readability and usability.
 Also known as data-hiding
 Steps to achieve data hiding: 
    - Declare variables of a class as private.
    - Provide public getter and setters.
    - Mostly achieved using access modifiers like public, private, protected and default.  
*/

public class DataEncapsulation {
    private int age;
    private int name;

    public DataEncapsulation(int age, int name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
    

}
