package OOP;

public class Constructor {

    int x;
    String fname;

    public Constructor(){
        x = 20;
        fname = "Luna";

    }

    public static void main(String[] args) {
        Constructor myObject = new Constructor();
        Main myObject2 = new Main();
        System.out.println(myObject.fname + "\n Age"+ myObject.x + "\n and My name is" + myObject2.fName);

    }
}
