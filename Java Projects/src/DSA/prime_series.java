package DSA;

public class prime_series {
    public static void main(String[] args) {
        prime(41);
    }

    public static void prime(int range)
    {
        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0)//2 % j<i if j = 2  | i = 3  % j = 2 j++ | j = 3 but j < i ! possible
                {
                     isPrime = false;
                     break;
                }
            }
            if(isPrime)
            {
                System.out.print(" "+i);
            }
        }
    }
}
