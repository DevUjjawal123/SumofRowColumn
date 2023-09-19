
public class Emp {
    private String name;
    public void get_emp(String k)
    {
        name= k;
    }
    public void printEmp() {
        System.out.println(name);
    }
    public class B{
        public static void main(String[] args) {
            Emp e1;
            e1 = new Emp();
            e1.get_emp("lab1");
            e1.printEmp();

        }

}}
