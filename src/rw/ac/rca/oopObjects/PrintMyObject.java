package rw.ac.rca.oopObjects;

public class PrintMyObject {
    public static void  main(String[] args){
        StaticParam pParams = new StaticParam();
        Person myPerson1 = new Person("jazzy");
        Person myPerson2 = new Person("jazzy" , 12);
        Person myPerson = new Person("Jazzy" , 12 , (float) 34.3);

        System.out.println(myPerson.name);
        System.out.println(myPerson.age);
        System.out.println(myPerson.height);
        System.out.println(pParams.GENDER_MALE);
        System.out.println(StaticParam.GENDER_FEMALE);

    }

}

