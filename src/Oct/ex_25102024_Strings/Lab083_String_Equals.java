package Oct.ex_25102024_Strings;

public class Lab083_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello"; //String Constant Pool
        String s4 = "Hello"; //String Constant Pool
        String s10 = "Hello"; //String Constant Pool

        String s2 = new String("Hello"); //Object Area
        String s3 = new String("Hello"); //Object Area
        String s5 = new String("hello"); //Object Area

        //1 SCP , 3 OA
        // == - Comparision operator
        // ==  This is checking the reference location.

        System.out.println(s1 == s3); //False
        System.out.println(s1 == s2); //False
        System.out.println(s2 == s3); //False
        System.out.println(s1 == s4); //True
        System.out.println(s3 == s5); //False

        System.out.println(s1.equals(s2)); //True
        System.out.println(s2.equals(s3)); //True
        System.out.println(s3.equals(s5)); //False
        System.out.println(s3.equalsIgnoreCase(s5)); //True
    }
}
