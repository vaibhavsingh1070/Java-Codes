package DSA;

public class bubble_sort {

    public static void main(String[] args) {
        bubble_sort_method(new int[]{23,12,76,78,34,57});
    }

    public static void bubble_sort_method(int[] arr)
    {
        //performing bubble sort
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //displaying sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
