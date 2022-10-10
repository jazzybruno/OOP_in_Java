package rw.ac.rca.oopMethods;

public class CarMethods {
    float speed;

   public CarMethods(float speed) {
       this.speed = speed;
   }

   public void fullSpeed(){
       System.out.println("The car is at its max");
   }

   public void speed(){
       System.out.println("The speed is now: " + speed);
   }
}
