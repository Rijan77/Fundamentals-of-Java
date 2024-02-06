package Java_Methods;

import java.util.Scanner;

public class Method_With_IF_Else {
    static void checkAge(int age){

        if (age<18){
            System.out.println("Access denied - You are not old enough!");
        }
        else if (age==18){
            System.out.println("Please wait one more year....");
        }
        else{
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.println("Please Enter Your Age: ");
        int age = sys.nextInt();

        checkAge(age);
    }
}
