package rw.ac.rca.oopAssignment;

public class OverloadingApp {
    public static void main(String[] args){
        Animal animal = new Animal();
        Pig pig = new Pig();
        Goat goat = new Goat();
        Sheep sheep = new Sheep();

        animal.Sound();
        pig.Sound();
        goat.Sound();
        sheep.Sound();

    }
}
