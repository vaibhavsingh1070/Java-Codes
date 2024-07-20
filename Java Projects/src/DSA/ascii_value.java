package DSA;

public class ascii_value {
    public static void main(String[] args) {
        ascii_converted_value(127);
    }

    public static void ascii_converted_value(int num)
    {
        String charecter = String.valueOf((char) num);
        System.out.println("Converted value is : "+charecter);
    }
}
