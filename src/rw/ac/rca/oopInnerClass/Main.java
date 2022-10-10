package rw.ac.rca.oopInnerClass;

public class Main {
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        StaticsOuter.Inner my2Inner = new StaticsOuter.Inner();

        System.out.println(myOuter.x + myInner.y);
        System.out.println(my2Inner.a);
    }
}
