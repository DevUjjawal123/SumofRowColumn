import java.util.Arrays;
public class variableargs {
    public static void main(String[] args) {
       // fun();
       multiple(2,3,"ujjawal");
    }
    static void multiple(int a,int b,String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
