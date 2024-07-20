package DSA;

public class natural_numbers {
    public static void main(String[] args) {
        natural_num(10);
    }

    public static void natural_num(int range)
    {
        int i=1;//natural number start from 1 and are infinite +ve integers
        do{
            System.out.print(" "+i);
            i++;
        }while(i<=range);
    }
}
