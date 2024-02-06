package Basic_Exercises;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sys.nextInt();

        if (number % 2 ==0){
            System.out.println("This is Even Number");
        }
        else{
            System.out.println("This is Odd Number");
        }

    }
}
