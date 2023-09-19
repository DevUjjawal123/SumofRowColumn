public class function2 {
    public static void main(String[] args) {
        String personalized =mygreet("ujjawal");
        System.out.println(personalized);

    }
    static String mygreet(String name){
        String message="hello"+name;
        return message;
    }
}
