package DSA;

public class fibonacci_series {

    public static void main(String[] args) {

        fibonacci(10);

    }

    public static void fibonacci(int range)
    {
        if(range <= 0)
        {
            System.out.println("invalid input !!");
        }

        int first = 0;
        int second = 1;

        System.out.print(first);

        if(range > 1)
        {
            System.out.print("  "+second);
        }

        for (int i = 3; i <= range; i++) {
            int next = first + second;
            System.out.print("  "+next);
            first = second;
            second = next;
        }
    }
}
