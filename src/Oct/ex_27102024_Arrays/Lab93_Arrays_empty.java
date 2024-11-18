package Oct.ex_27102024_Arrays;

import java.util.Scanner;

public class Lab93_Arrays_empty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i=0; i < size; i++)
        {
            System.out.println("Enter the number" +(i+1));
            numbers[i] = sc.nextInt();
        }

        System.out.println("-----");
        //Print the numbers entered by the user
        System.out.println("The numbers are :");
        for (int i=0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

    }
}
