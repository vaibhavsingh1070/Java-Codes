package DSA;

public class multiplication_table {

    public static void main(String[] args) {
        table();
    }

    public static void table()
    {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(" "+(i*j));
                if(j==10)
                {
                    System.out.println();
                }
            }

        }
    }
}
