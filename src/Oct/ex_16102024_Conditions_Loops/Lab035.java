package Oct.ex_16102024_Conditions_Loops;

public class Lab035 {
    public static void main(String[] args) {
        //Create a program to check wheather Arjun will go to Goa or Not
        //Take a input age = Arjun -> Goa
        //age > 25 -> Drinking - Goa
        //Ternary Operator

        int age = Integer.parseInt(args[0]);
        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");
    }
}
