package Basic_Exercises;
import java.util.Scanner;

public class CalculateProduct {

    public static int calculateProduct(int num1, int num2){

        return num1 * num2;
    }

    public static void main(String[] args) {

    Scanner  sys = new Scanner(System.in);
    System.out.println("Enter First Number: ");
    int num1 = sys.nextInt();

    System.out.println("Enter Second Number: ");
    int num2 = sys.nextInt();

    int result = calculateProduct(num1, num2);
        System.out.println("The Product of two number is:" + result);

    sys.close();

    }

}
