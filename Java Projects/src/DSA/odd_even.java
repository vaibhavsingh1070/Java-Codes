package DSA;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max;
        System.out.println("Choose one option : ");
        System.out.println("1. Even \n2. Odd \n3. None of the above");
        int choice = input.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("enter the range for even numbers : ");
                max = input.nextInt();
                even(max);
                break;
            case 2:
                System.out.println("enter the range for odd numbers : ");
                max = input.nextInt();
                odd(max);
                break;
            case 3:
                System.out.println("You can exit ....");
                break;
            default:
                System.out.println("Invalid Input !!");
        }
    }

    public static void odd(int range)
    {
        for (int i = 1; i <= range; i++) {
            if(i % 2 != 0)
                System.out.print(" "+i);
        }
    }

    public static void even(int range)
    {
        for (int i = 0; i <= range; i+=2) {
            System.out.print(" "+i);
        }
    }
}
