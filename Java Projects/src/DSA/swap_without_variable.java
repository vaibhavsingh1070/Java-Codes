package DSA;

public class swap_without_variable {

    public static void main(String[] args) {
        swap(55,9);
    }

    public static void swap(int a , int b)
    {
        System.out.println("Current Value of a : "+a+"\nCurrent Value of b : "+b);
        //Before swapping a = 10 | b = 5
        a = a + b;// a = 10 + 5 | a = 15
        b = a - b;// b = 15 - 5 | b = 10
        a = a - b;// a = 15 - 10| a = 5
        //after swapping a = 5 | b = 10
        System.out.println("\n\nValue of a : "+a+"\nValue of b : "+b);
    }

}
