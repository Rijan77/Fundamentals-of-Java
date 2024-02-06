//Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.

package Basic_Exercises;

public class Number_Divisible {
    public static void main(String[] args) {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
                }
        System.out.println("\n Divisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);

            }
        }
        System.out.println("Number between 1 and 100 which is divisible by both 3 and 5:");
        for(int i = 1; i<=100; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println(i);
            }
        }

    }
}
