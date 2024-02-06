package Basic_Java;

import java.util.Scanner;

public class IF_ELSE {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Password: ");
            String password = scanner.next();

            if (password.equals("Rijan")){
                System.out.println("Hello Rijan");
            } else if (password.equals("Luna")) {
                System.out.println("Hello Luna");
            }
            else{
                System.out.println("Sorry....Try Again");
            }
            scanner.close();

        }
    }


