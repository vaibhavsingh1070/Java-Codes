package DSA;

import java.util.Arrays;

public class Students_stats {

    public static void main(String[] args) {
        Students_stats s1 = new Students_stats("Rahul",2105042);
        s1.read_marks(new int[]{54,67,89,48,78},500);
        s1.calculate_percentage();
        s1.display_percentage();
    }

    int roll_no;
    String name;
    int[] marks;
    float percentage;
    int Total;

    public  Students_stats(String n, int roll)
    {
        this.roll_no = roll;
        this.name = n;
    }

    public void read_marks(int[] m , int Total)
    {
        this.marks = m;
        this.Total = Total;
    }

    public void calculate_percentage()
    {
        percentage = ((float) Arrays.stream(marks).sum() / Total) * 100;
    }

    public void display_percentage()
    {
        System.out.println("Roll no :"+roll_no+" ,"+name+" has received : "+percentage);
    }

}
