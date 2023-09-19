import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
       /* int n = 162426;
        int ans =0;
        while(n>0){
            int rem = n % 10;
            n = n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);*/
        int n=23443;
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
