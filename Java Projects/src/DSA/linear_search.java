package DSA;

public class linear_search {
    public static void main(String[] args) {
        linear_search_method(new int[]{5, 3, 1, 9, 2},1);
    }


    public static void linear_search_method(int[] arr, int num){
        for (int i =0; i< arr.length; i++)
        {
            if(arr[i] == num )
            {
                System.out.println(num+" found at index "+i);
            }
        }
    }
}
