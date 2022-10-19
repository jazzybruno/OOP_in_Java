package rw.ac.rca.oopExercise;

public class Shape {
    private int color;
    private float area;

    public void getColor(){

        System.out.println(color);
    }

    public int getArea() {
        return color;
    };

    public void setArea(int area) {
        this.area = area;
    }

    public void setColor(int color){
        this.color = color;
    }
    public void sayNAme(){
        System.out.println("I am the super class Shape");
    }

    public float area(float radius) {
        System.out.println("This should be the area");
        return (float) 0.56;
     }
}
