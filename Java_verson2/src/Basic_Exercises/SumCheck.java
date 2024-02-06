package Basic_Exercises;

import java.util.Scanner;

public class SumCheck {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sys.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sys.nextInt();
        System.out.println("Enter Third Number");
        int num3 = sys.nextInt();

        if(num1+num2 == num3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
