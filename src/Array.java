import java.util.*;

public class Array {
    public static void main(String[] args) {
       /* Scanner in=new Scanner(System.in);

        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
            System.out.println(Arrays.toString(str));
            str[1]="ujjawal";
            System.out.println(Arrays.toString(str));
        }*/



       /* int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
   }
   static void change(int[] arr){
        arr[0]=9;*/
        Scanner in=new Scanner(System.in);

        int[][] arr = new int[3][3];
        System.out.println(arr.length);

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();

        }}
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.println(arr[row][col] + " ");
}
            System.out.println();

        }}}
