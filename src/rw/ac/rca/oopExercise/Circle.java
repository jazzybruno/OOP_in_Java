package rw.ac.rca.oopExercise;

public class Circle extends Shape{
   private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void sayNAme(){
        System.out.println("I am the child class Circle");
    }

    public void mySpecificName(){
        System.out.println("I am specifically a circle");
    }

    public float area(float radius){
        float area = (float) (radius * radius * 3.142);
        return area;
    }
}
