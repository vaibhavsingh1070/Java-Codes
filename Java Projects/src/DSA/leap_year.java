package DSA;

public class leap_year {

    public static void main(String[] args) {
       leap_year_method((short) 1900);
    }

    public static void leap_year_method(short year)
    {
        //1900 is not a leap year its divided by 100 but not 400
        if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
        {
            System.out.println(year+" it is a leap year...");
        }else{
            System.out.println(year+" its not a leap year....");
        }
    }

}
