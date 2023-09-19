public class linearsearch6 {
    public static void main(String[] args) {
       int[] nums={1,12,3445,30};
        System.out.println(findnumber(nums));
    }
    static int findnumber(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigit=digit(num);
        return numberofdigit % 2 == 0;
    }
   static int digit(int num){
       if(num==0){
           return 1;
       }
       int count=0;while(num>0){
           count++;
           num=num/10;
       }
       return count;
   }
}
