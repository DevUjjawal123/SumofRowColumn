import java.util.*;
public class linearsearch5 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8},
                {12, 34, 23, 45, 67},
                {98, 76, 55, 45}
        };
        int target=4;
        int[] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[] [] arr, int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target) return new int[]{row, col};
            }
        }
        return new int[0];
    }
}
