package Oct.ex_14102024_Operators;

public class Lab031 {
    public static void main(String[] args) {
        //GST - 18.45
        int course = 100;
        float GST = 18.45f;
        int total_price = course+(int) GST; // Narrowing -> Explicit
        System.out.println(total_price);
    }
}
