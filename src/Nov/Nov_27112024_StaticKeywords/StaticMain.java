package Nov.Nov_27112024_StaticKeywords;

public class StaticMain {
    public static void main(String[] args) {
        //1. Static method can access static stuff directly ( with out object)
        System.out.println(StaticDemo.a);
        StaticDemo.m1();
        // System.out.println(b); // cannot access, because b is non-static variable
        // m2(); // cannot access, because m2 is non-static method

        //2. Static method can also access non-static stuff through object
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b);
        sd.m2();
        sd.m();
    }
}
