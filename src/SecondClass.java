public class SecondClass {
    public static void main(String[] args){
        System.out.println("Hello We are learning OOP in java");
        FirstClass myObject = new FirstClass();
        FirstClass myObject2 = new FirstClass();

        System.out.println("This is from the firstclass: " + myObject2.name);
        System.out.println(myObject.x);
        System.out.println(myObject2.y);
        myObject2.Greet(myObject2.name);
        myObject.Goodbye(myObject2.name);
    }
}
