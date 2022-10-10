package rw.ac.rca.oopInheritance;

public class Child extends Person {
    private String name = "Jazzy Bruno";

    public static void main(String[] args){
        Child newChild = new Child();

        System.out.println(newChild.eyeColor);
        System.out.println(newChild.hairColor);
        System.out.println(newChild.height);
        newChild.greet("Jazzy Bruno");
        newChild.bye("Jazzy Bruno");
    }


}
