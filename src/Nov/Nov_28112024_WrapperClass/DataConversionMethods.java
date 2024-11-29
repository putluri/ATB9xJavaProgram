package Nov.Nov_28112024_WrapperClass;

public class DataConversionMethods {
    public static void main(String[] args) {
        //String --> int
      // String s = "welcome"; //Cannot convert to int
      /*  String s1 = "10";
        String s2 = "20";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
         */

        //String --> double
      /*  String s1 = "10.5";
        String s2 = "20.0";
        System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
        */

        //String --> boolean
       // String s1 = "selenium"; //Other than true, if you pass any string it will return false
       // System.out.println(Boolean.parseBoolean(s1));

        //int, double, float, char --> String
        int a = 10;
        double d = 10.5;
        char c = 'a';
        boolean b = true;
        String s = String.valueOf(a);
        System.out.println(s);

        s=String.valueOf(d);
        System.out.println(s);

        s=String.valueOf(d);
        System.out.println(c);

        s=String.valueOf(b);
        System.out.println(s);
    }
}
