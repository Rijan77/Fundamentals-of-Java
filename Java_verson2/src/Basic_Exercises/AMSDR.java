package Basic_Exercises;

import java.util.Scanner;

public class AMSDR {
    static void asmdr(int num1, int num2) {
        int sum = num1 + num2;
        int multiply = num1 * num2;
        int substract = num1 - num2;
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            int quotient = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("The Sum Of the two number is" + sum);
            System.out.println("The multiply Of the two number is" + multiply);
            System.out.println("The substract Of the two number is" + substract);
            System.out.println("The divide Of the two number is" + quotient);
            System.out.println("The remainder Of the two number is" + remainder);

        }
    }


    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int num1 = sys.nextInt();
        System.out.println("Input Second Number: ");
        int num2 = sys.nextInt();

        asmdr(num1, num2);

        // Close the Scanner
        sys.close();
    }

}
