public class typecast {
    public static void main(String[] args){
        /*int num=(int)(45.45f);   //typecaasting
       System.out.println(num);
         int a = 257;
         byte b = (byte)(a);// 257%256=1
        System.out.println(b);
        int number = 'a';
        System.out.println(number);
*/
        byte b=42;
        char c='a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d =8.3443;
        double result = (f * b) + (f / c)  - ( d * s );
        System.out.println((f * b)+ " " + (f / c) + " " + (d*s));
        System.out.println(result);


    }
}
