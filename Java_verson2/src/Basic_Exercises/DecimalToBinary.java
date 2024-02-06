package Basic_Exercises;

import java.util.Scanner;

public class DecimalToBinary {
    static String convertToBinary(int decimalNumber){
        return Integer.toBinaryString(decimalNumber);
    }

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);

        System.out.println("Enter Decimal Number: ");
        int decimalNumber = sys.nextInt();

        String binaryNumber = convertToBinary(decimalNumber);

        System.out.println("THe Binary Number of" + " "+ decimalNumber + " "+ "is" + " "+ binaryNumber);

    }
}
