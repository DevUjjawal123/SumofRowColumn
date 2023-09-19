import java.util.Arrays;

public class linearsearch4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -5, 6, 7};
        System.out.println((min(arr)));
    }
    static int min(int[] arr){
        int ans=arr[0];
        for (int i=0;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
