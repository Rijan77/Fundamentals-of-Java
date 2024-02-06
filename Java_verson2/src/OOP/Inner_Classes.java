package OOP;

class Parents_Classes{
    String fName = "Aayansh";


    class Child_Classes{

        String fName = "is the Brother of Aayara";

    }

}

public class Inner_Classes {

    public static void main(String[] args) {
        Parents_Classes myObject = new Parents_Classes();
        Parents_Classes.Child_Classes mySecond = myObject. new Child_Classes();

        System.out.println(myObject.fName + " " + mySecond.fName);
    }
}
