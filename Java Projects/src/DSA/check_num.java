package DSA;

import java.util.Scanner;

public class check_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        check_number(num);
    }
    public static void check_number(int num)
    {
        if(num > 0 )
        {
            System.out.println("It is a positive number...");
        } else if (num < 0) {
            System.out.println("It is a negative number...");
        }else {
            System.out.println("Its Zero !");
        }
    }

}
