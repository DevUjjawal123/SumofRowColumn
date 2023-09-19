
import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans= prime(n);
        System.out.println(ans);

    }
    /*static boolean prime(int n){
        if(n<=1){
            return false;

        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }

        return c*c>n;
    }*/
    static boolean prime(int n){
        int original =n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==original){
            return true;
        }
        return false;

    }

}
