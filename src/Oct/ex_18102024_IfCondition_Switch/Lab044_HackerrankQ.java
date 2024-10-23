package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab044_HackerrankQ {
    public static void main(String[] args) {

        //Grade Calculator:
        //Write a program that calculates and displays the letter grade
        //for a given numerical score (e.g., A,B,C,D, or F)
        //based on the following scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        //Logic Building - Java

        //Step1
        //Find the inputs / outputs
        // Input / Score -> (0 - 100) -> data type -> int
        //Output / grade -> data type -> char

        //2. Basic Logic / Rough Logic
        //if(score >= 90 && score <= 100) -> return or print grade - A
        //else if score <=89 && score >= 80 -> return or print grade - B
        //else if score <=79 && score >= 70 -> return or print grade - C
        //D,E
        // // else -> grade -> F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <= 100){
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score <= 0 || score > 100) {
            System.out.println("LOL!!, are you God?");
            grade = '0';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is ->" +grade);
    }
}
