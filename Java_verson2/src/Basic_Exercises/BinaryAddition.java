package Basic_Exercises;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.println("Enter First Binary Number:");
        String binary1 = sys.nextLine();

        System.out.println("Enter Second Binary Number:");
        String binary2 = sys.nextLine();

        String result = addBinary(binary1, binary2);

        System.out.println("Sum of two binary numbers: "+ result);
    }

    private static String addBinary(String binary1, String binary2){
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        int sum = num1 * num2;

        return Integer.toBinaryString(sum);
    }
}
