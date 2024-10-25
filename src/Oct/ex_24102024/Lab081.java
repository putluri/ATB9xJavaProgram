package Oct.ex_24102024;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        //Create a Function of Sum, sub, Mul and Div with parameters a, b (take the parameters)
        //
        //3 -> User input
        //4 -> User input
        //sum -> sum of 3 and 4
        //sub -> sub of 3 and 4
        //mul -> mul of 3 and 4
        //div -> div of 3 and 4
        //return all the values

        // Logic Building

        // Step 1 -> Inputs and Outputs
        // a,b - int -> Scanner
        // int -> variable result ->

        //Step 2 - Rough logic -> Create functions
        // Function -> typr 4th - with return and with arguments/parameters

        // Step 3 - write the code and Fix -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = scanner.nextInt();
        System.out.println("Enter the num2");
        int b = scanner.nextInt();
        int result = sum_of_numbers(a,b);
        System.out.println("sum is -> "+result);

        int result_sub = sub_of_numbers(a, b);
        System.out.println("sub is -> "+result_sub);

        int result_mul = mul_of_numbers(a, b);
        System.out.println("mul is -> "+result_mul);

        int result_div = div_of_numbers(a, b);
        System.out.println("mul is -> "+result_div);

        int result_mod = modulus_of_numbers(a, b);
        System.out.println("Modulus is -> "+result_mod);

        scanner.close();

    }

    static int modulus_of_numbers(int a, int b) {
        return a%b;
    }

    static int mul_of_numbers(int a, int b) {
        return a*b;
    }

    static int sub_of_numbers(int a, int b) {
        return a-b;
    }

    static int div_of_numbers(int a, int b) {
        return a/b;
    }

    static int sum_of_numbers(int a, int b) {
        return a+b;
    }


}
