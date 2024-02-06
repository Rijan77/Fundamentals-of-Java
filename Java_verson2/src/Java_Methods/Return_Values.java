package Java_Methods;

import java.util.Scanner;

public class Return_Values {


    static int myMethod(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.println("Enter First Number for X: ");
        int x = sys.nextInt();
        System.out.println("Enter Second Number for Y: ");
        int y = sys.nextInt();

        int result = myMethod(x, y);
        System.out.println("The Result is: " + result);


    }
}
