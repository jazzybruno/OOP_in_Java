package rw.ac.rca.oopModifiers;

public class Modifiers {
    public int age = 15;
    public void walk(){
        System.out.println("I am walking");
    }

    private int agePrivate;

    public void setAgePrivate(int age){
        this.agePrivate = age;
    }

    public void printAge(){
        System.out.println("This is my age: " + this.agePrivate);
    }

    protected int ageProtected;

    public void setAgeProtected(int age){
        this.ageProtected = age;
    }

    public void printAgeProtected(){
        System.out.println("This is my age: " + this.ageProtected);
    }

}
