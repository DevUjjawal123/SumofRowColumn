import java.util.*;

public class largestof3num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
       /* if(a>b){
            System.out.println("a");
        }else if(b>c){
            System.out.println("b");
        }
        else if(c>a){
            System.out.println("c");
        }
        else if(c>b){
            System.out.println("c");
        }
        else if(a>c){
            System.out.println("a");
        }
        else if(b>a){
            System.out.println("b");
        }
        else{
            System.out.println("equal");
        }*/
        int max =Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}
