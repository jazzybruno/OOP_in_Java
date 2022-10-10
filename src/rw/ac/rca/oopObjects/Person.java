package rw.ac.rca.oopObjects;

public class Person {
    String name;
    int age;
    float height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }


    public  Person(String name , int age , float height) {
        this.name = name;
        this.age = age;
        this.height = (float) height;
    }
}
