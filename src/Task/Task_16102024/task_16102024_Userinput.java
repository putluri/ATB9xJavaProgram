package Task.Task_16102024;

import java.util.Scanner;

public class task_16102024_Userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter your input
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        //Printing the user input
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

        scanner.close();
    }
}
