package rw.ac.rca.oopExercise;

public class InheritanceApp {


    public static void main(String[] args){
        Shape shape = new Shape();
        shape.sayNAme();

        Shape myShape = new Circle();
        myShape.sayNAme();

        Square mySquare = new Square();
        mySquare.sayNAme();

        myRealName(mySquare);

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
