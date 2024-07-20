package DSA;

public class binary_search {

    public static void main(String[] args) {
        //note for binary search to work properly array must be sorted.
        binary_search_method(new int[]{10,17,26,45,67,69,90},26);
    }

    public static void binary_search_method(int[] arr, int num){
        int start = 0;
        int end = arr.length;

        while(start <= end)
        {
            int mid=(start + end) / 2;

            if(arr[mid] < num)
            {
               start = mid + 1;
            } else if (arr[mid] == num) {
                System.out.println(num+" found at "+mid);
                break;
            }
            else {
                end = mid - 1;
                mid = (start + end) / 2;
            }

            if(start > end){
                System.out.println(num+" not found !!!");
            }
        }
    }
}
