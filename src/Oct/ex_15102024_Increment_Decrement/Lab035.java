package Oct.ex_15102024_Increment_Decrement;

public class Lab035 {
    public static void main(String[] args) {
        //Pre-Increment - Decrement
        //value is incremented first and then storedin the result
        int a=10;
        int b= ++a;
        System.out.println(b);

        //Post Increment
        int c=11;
        System.out.println(c++);
        System.out.println(c);
    }
}
