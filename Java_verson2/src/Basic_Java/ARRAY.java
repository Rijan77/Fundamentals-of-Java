package Basic_Java;

import java.util.Arrays;

public class ARRAY {
    public static void main(String[] args) {
        String[] cars = {"Rolls-Royce", "BMW", "Tesla", "Mercedes"};

//        System.out.println(Arrays.toString(cars));
        cars[1]="Audi";
        for (String car : cars) {
            System.out.println(car);
        }

//        System.out.println(cars[0]);
        System.out.println(cars.length);


    }
}
