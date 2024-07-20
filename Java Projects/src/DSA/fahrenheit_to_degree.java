package DSA;

public class fahrenheit_to_degree {
    public static void main(String[] args) {
        fahrenheit_to_degreeCelsius(100);
    }

    public static void fahrenheit_to_degreeCelsius(float temperature)
    {
        float celsius = (temperature - 32) * 5/9;
        System.out.println(temperature+" degree fahrenheit to degree celsius is :  "+celsius);
    }
}
