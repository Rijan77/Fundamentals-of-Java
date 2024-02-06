package Basic_Exercises;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.println("Enter the Word: ");
        String word = sys.nextLine();

        StringBuilder wordreverse = new StringBuilder(word);
        word = wordreverse.reverse().toString();

        System.out.println("Reverse word: " + word);

//        String reverseWord = reverseWord(word);
//
//        System.out.println("Reverse word:" + reverseWord);
//
//
//    }
//    static String reverseWord (String word){
//        StringBuilder reverse = new StringBuilder();
//
//        for (int i = word.length()-1; i>=0; i-- ){
//            reverse.append(word.charAt(i));
//        }
//        return reverse.toString();



    }
}
