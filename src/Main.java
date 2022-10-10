public class Main {
   int x = 12;
   String name = "Jazzy Bruno";
    public void Greet(String name){
        System.out.println("Hello There  i am: " + name);
    }

    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj.name);
        myObj.Greet(myObj.name);
    }
}