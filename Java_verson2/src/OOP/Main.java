package OOP;



public class Main {
    String fName = "Rijan Acharya";

    int age= 21;

    public static void main(String[] args) {
//        Main myObject = new Main();
//        Main myObject2 = new Main();
//        System.out.println(myObject.x + myObject.y + "==Result");
//
//        myObject2.x=60;
//        System.out.println(myObject2.x - myObject2.y);

        Main myObject = new Main();
        System.out.println("My name is" + " " + myObject.fName + " \n and  My Age is" + myObject.age);
    }

}
