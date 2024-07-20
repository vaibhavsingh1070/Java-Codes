package DSA;

public class factorial {

    public static void main(String[] args) {
       // factorial_using_loop(5);
        factorial_using_recursion(5);


    }
    
    public static void factorial_using_loop(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i ;
        }
        System.out.println("The factorial of "+num+" is : "+fact);
    }

    public static int factorial_using_recursion(int num)
    {
        //logic ( factorial(0) = 1
        //1st step factorial(1) | 1 * 1 = 1 | pass '1' to fact(2)
        //2nd step factorial(2) | 2 * 1(received value) = 2 | pass '2' to fact(3)
        //3rd step factorial(3) | 3 * 2 = 6    | pass '6' to fact(4)
        //4th step factorial(4) | 4 * 6 = 24   | pass '24' to fact(5)
        //5th step factorial(5) | 5 * 24 = 120 | final value : 120 of factorial(5)
        if(num == 0){
            System.out.println("Reached base case , returning 1");
            return 1;
        }else{
           int result =  num * factorial_using_recursion(num - 1);//recursive step
            System.out.println("The factorial is :"+result);
            return result;
        }
    }

}
