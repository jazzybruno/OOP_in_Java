package rw.ac.rca.oopInheritance;

public class Person {
    protected String hairColor = "Black";
    protected String eyeColor = "Green";
    protected float height = (float) 10.5;


    protected void greet(String name){
        System.out.println("Good Morning my name is: " + name);
    }

    protected void bye (String name){
        System.out.println("Good bye from : " + name);
    }
 }
