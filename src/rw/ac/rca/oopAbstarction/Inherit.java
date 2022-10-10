package rw.ac.rca.oopAbstarction;

public class Inherit extends Animal {

    public void AnimalSound(String name){

        String sound = null;

        if(name.equals("Cow")){
            sound = "Meeeh";
        }else if (name.equals("Goat")){
            sound = "Mooow";
        }else{
            sound = "unknown";
        }
        System.out.println("They animal says " + sound);
    }
}
