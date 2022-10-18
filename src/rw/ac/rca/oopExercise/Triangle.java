package rw.ac.rca.oopExercise;

public class Triangle extends Shape {
    private float width;
   private  float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) { 
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void sayNAme(){
        System.out.println("I am the child class Triangle");
    }
}
