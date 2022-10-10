package rw.ac.rca.oopPolymorthism;

public class Main {
    public static void main(String[] args){
        Animal newAnimal = new Animal();
        Pig newPig = new Pig();
        Goat newGoat = new Goat();
        Sheep newSheep = new Sheep();

        newAnimal.AnimalSound();
        newGoat.AnimalSound();
        newSheep.AnimalSound();;
        newPig.AnimalSound();;
    }
}
