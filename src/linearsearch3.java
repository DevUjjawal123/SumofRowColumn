public class linearsearch3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 2;
        System.out.println(linearsearch(arr,target,0,2));
    }

    static int linearsearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}