package rw.ac.rca.oopExercise;

public class Rectangle extends Shape {
    private float width;
   private float length;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void sayNAme(){
        System.out.println("I am the child class Rectangle");
    }
}
