package DSA;

import java.util.ArrayList;

public class selection_sort {

    public static void main(String[] args) {
        selection_sort_method(new int[]{67,29,90,24,11});

        ArrayList<Integer> list = new ArrayList<>();//Arraylist syntax
    }

    public static void selection_sort_method(int[] arr)
    {
        //performing selection sort
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {//j = i + 1 ! j = 1
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //displaying sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
