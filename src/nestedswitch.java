import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.next();
        switch(a){
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                switch(b){
                    case "hello":
                        System.out.println("lol");
                        break;
                        default:
                        System.out.println("niklo");
                }
        }
    }


}
