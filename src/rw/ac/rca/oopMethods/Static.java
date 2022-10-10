package rw.ac.rca.oopMethods;

public class Static {

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void  speed(float maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args){
        Static myCar = new Static();
        myCar.fullThrottle();
        myCar.speed((float) 123.43);
    }
}
