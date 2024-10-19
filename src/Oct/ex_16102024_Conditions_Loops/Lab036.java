package Oct.ex_16102024_Conditions_Loops;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {
        //Scanner - class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println(age>25 ? "Allowed to Goa" : "Not Allowed");
        scanner.close();
    }
}
