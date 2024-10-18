package Oct.ex_14102024;

public class Lab029_Typecasting {
    public static void main(String[] args) {
        //Type Casting -
        //Widening - Implicit, Explicit - lossless
        //Narrowing - Implicit, Explicit(with data type), loss

        //Widening - Implicit, Explicit - lossless
        byte b = 10;
        int a=b; //valid -> Implicit Casting - JVM
        int a1=(int)b;

        //Narrowing - Implicit, Explicit(with data type), loss
        int val = 200;
       // byte b2 = val; //Invalid - Implicit -JVM
        byte b3 = (byte) val;  //Valid - Explicit -User

    }
}
