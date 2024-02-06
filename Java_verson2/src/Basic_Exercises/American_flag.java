package Basic_Exercises;

public class American_flag {
    public static void main(String[] args) {
        String part1 = "* * * * * * ==================================";
        String part2 = "==============================================";

        for(int i = 1; i<=9; i++){
            System.out.println(part1);
        }
        for(int i=1; i<=6; i++){
            System.out.println(part2);
        }
    }
}
