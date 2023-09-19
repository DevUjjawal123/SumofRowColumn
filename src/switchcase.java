import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch(fruit){
            case "mango":
                System.out.println("ujjawal");
                break;
            case "apple":
                System.out.println("luck");
                break;
            case "banana":
                System.out.println("lol");
                break;
            case "orange":
                System.out.println("ujj");
                break;
            case "peer":
                System.out.println("ls,");
                break;
            default:
                System.out.println("lol");
        }
    }

}
