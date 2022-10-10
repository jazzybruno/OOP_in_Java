package rw.ac.rca.oopAbstarction;

abstract class Animal {
    abstract void AnimalSound(String name);
    public void Sleep(String name){
        System.out.println("Animal named " + name + " sleeps like this: ZzzZzZ");
    }
    ;
}


