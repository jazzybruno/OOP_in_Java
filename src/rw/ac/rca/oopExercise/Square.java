package rw.ac.rca.oopExercise;

public class Square extends Shape  {
   private float side;

   public float getSide() {
      return side;
   }

   public void setSide(float side) {
      this.side = side;
   }

   public void sayNAme(){
      System.out.println("I am the child class Square");
   }

   public float area(float side){
      float area = (float) side * side;
      return area;
   }
}
