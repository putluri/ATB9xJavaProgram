package Nov.Nov_27112024_StaticKeywords;

public class StaticDemo {
    static int a = 10;  // static variable
    int b = 20; // non-static variable

    static void m1() { // static method
        System.out.println("this is m1 - static method");
    }
    void m2() { // non-static method
        System.out.println("this is m2 - non-static method");
    }
    void m() // non-static method
    {
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
   /* public static void main(String[] args) {
        //1. Static method can access static stuff directly ( with out object)
        System.out.println(a);
        m1();
     // System.out.println(b); // cannot access, because b is non-static variable
     // m2(); // cannot access, because m2 is non-static method

        //2. Static method can also access non-static stuff through object
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.m2();
        sd.m();
   }  */
}