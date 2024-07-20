package DSA;

import java.util.Arrays;
import java.util.OptionalDouble;

public class average {
    public static void main(String[] args) {
        average_of_nums(new int[]{1,2,3,4,5});
    }

    public static void average_of_nums(int[] arr)
    {
        OptionalDouble avg = Arrays.stream(arr).average();
        System.out.println("The average is : "+avg);
    }
}
