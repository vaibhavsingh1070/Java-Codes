package DSA;

public class matrix_addition {

    public static void main(String[] args) {
        // { {row} {row} {column} } // for adding new row | add a new bracket
        // { {column} {column} } //for adding new colum | add new elements in same bracket
       int[][] arr1={ {1,2,3} /*,{4,4}*/, {3,3,1} };
       int[][] arr2={ {1,1,2} /*,{1,1}*/, {1,1,3} };
       int[][] result = add(2,3,arr1,arr2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] add(int row,int column,int[][] arr1,int[][] arr2)
    {
        int result[][] = new int[row][column];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                 result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }

}
