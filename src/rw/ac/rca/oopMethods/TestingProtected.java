package rw.ac.rca.oopMethods;

import rw.ac.rca.oopModifiers.Modifiers;

public class TestingProtected {
    public static void main(String[] args){
        Modifiers myObject = new Modifiers();

        myObject.setAgeProtected(15);
        myObject.printAgeProtected();
    }

}
