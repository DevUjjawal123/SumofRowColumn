public class smp {
    private String name;
    smp(String k){
        name=k;
    }
    public void printsmp(){
        System.out.println(name);
    }
    public class B{
        public static void main(String[] args) {
            smp e1=new smp("tom");
            e1.printsmp();
        }
    }
}
