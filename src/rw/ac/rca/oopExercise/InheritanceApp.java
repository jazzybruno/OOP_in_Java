package rw.ac.rca.oopExercise;

public class InheritanceApp {


    public static void main(String[] args){
        Shape shape = new Shape();

        Shape myCircle = new Circle();

        Square mySquare = new Square();

        Triangle myTriangle = new Triangle();

        Rectangle myRectangle = new Rectangle();

        myRealName(mySquare);

        System.out.println("This is the implementation of overloading and overiding");
        System.out.println("");
        float length = (float) 12.4;
        float width = (float) 6.5;
        float base = (float) 8.45;
        float radius = (float) 4.45;
        float height = (float) 9.46;
        float side = (float) 12.45;

        float areCircle = myCircle.area(radius);
        float areTriangle = myTriangle.area(base , height);
        float areSquare = mySquare.area(side);
        float areRectangle = myRectangle.area(length , width);

        System.out.println("This is the are of a circle: " + areCircle);
        System.out.println("This is the are of a triangle: " + areTriangle);
        System.out.println("This is the are of a square: " + areSquare);
        System.out.println("This is the are of a Rectangle: " + areRectangle);

    }

    public static void myRealName(Shape shape){

        shape.sayNAme();

        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            circle.mySpecificName();
        }else{
            System.out.println("Oooh i am not a circle i am a  " + shape.getClass() );
        }

    }

}
