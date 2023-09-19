import java.util.Scanner;

public class alphabetcasecheak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ab=sc.next().trim().charAt(0);

        if (ab >= 'a' && ab<='z'){
        System.out.println("Lowercase");}
        else {
            System.out.println("uppercase");
        }

}}
