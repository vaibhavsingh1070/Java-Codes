package DSA;

public class calling_static_methods {
    public static void main(String[] args) {

        // 1. For Static methods
        // class_name.function_name(parameters);
        ascii_value.ascii_converted_value(75);

        // 2. For Non-Static Methods
        //create an obj with class name
        // obj.function_name(parameters);
        Students_stats s2 = new Students_stats("Shipra",2105077);
        s2.read_marks(new int[] {78,90,56,88,65,67},500);
        s2.calculate_percentage();
        s2.display_percentage();

    }
}
