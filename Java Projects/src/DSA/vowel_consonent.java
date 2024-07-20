package DSA;

public class vowel_consonent {
    public static void main(String[] args) {
       // multiplication_table obj = new multiplication_table();
       // obj.table();//can call static method of other  class in same package

        check_vowel('A');
    }

    public static void check_vowel(char chrr)
    {
        char chr = Character.toLowerCase(chrr);

        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
        {
            System.out.println("It is a vowel...");
        }else {
            System.out.println("It is a consonant !");
        }
    }


}
