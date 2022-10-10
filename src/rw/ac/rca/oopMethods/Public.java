package rw.ac.rca.oopMethods;

public class Public {
    public void publicMethod(String name) {
        System.out.println("Hello Mr. " + name);
    }

    static void staticMethod(String name){
        System.out.println("Hello Mr. " + name);
    }

    public static void main(String[] args){
        staticMethod("Jazzy");
        Public newObj = new Public();
        newObj.publicMethod("Jazzy");
    }
}
