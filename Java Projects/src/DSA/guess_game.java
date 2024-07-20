package DSA;

import java.util.Scanner;
import static java.lang.Math.random;

public class guess_game {
    public static void main(String[] args) {
        int guess;
        int attempts=0;
        int random_num = (int) (random()*100);
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Guess the number : ");
            guess = sc.nextInt();

            if(guess > random_num)
            {
                System.out.println("Your number is greater than the x num !");
            } else if (guess == random_num) {
                System.out.println("\nBoom ! You have found the number its "+random_num);
            }else {
                System.out.println("Your number is smaller than the x num !");
            }
            attempts++;
        }while(guess!=random_num);

        System.out.println("You have guessed the number in "+attempts+" attempts ....");
    }
}
