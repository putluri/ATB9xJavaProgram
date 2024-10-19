package Oct.ex_14102024_Operators;

public class Lab030_typecasting {
    public static void main(String[] args) {
        long phone_no = 985461287;
        //short s= long; // Implicit - JVM
        short s= (short) phone_no; // Explicit - User - Loss that data

    }
}
