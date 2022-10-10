package rw.ac.rca.oopModifiers;

public class Accessing {
    public static void main(String[] args){
        Modifiers myObject = new Modifiers();
        myObject.age = 20;
        myObject.walk();

        myObject.setAgePrivate(17);
        myObject.printAge();

        myObject.ageProtected = 20;
        myObject.setAgeProtected(15);
        myObject.printAgeProtected();
    }
}
