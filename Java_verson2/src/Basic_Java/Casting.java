package Basic_Java;

public class Casting {
    // Widening Casting
//    public static void main(String[] args) {
//        int myInt = 9;
//        double myDouble = myInt; // Automatic casting: int to double
//
//        System.out.println(myInt);      // Outputs 9
//        System.out.println(myDouble);   // Outputs 9.0
//    }

    // Narrowing Casting
    public static void main(String[] args) {
        double myDouble = 9.78d;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);

    }
}
