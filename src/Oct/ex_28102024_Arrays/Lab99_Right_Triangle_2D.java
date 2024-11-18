package Oct.ex_28102024_Arrays;

import java.util.Scanner;

public class Lab99_Right_Triangle_2D {
    public static void main(String[] args) {
        //*
        //**
        //***
        //****
        //*****
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int n = sc.nextInt();
        for (int i=1; i < n; i++){
            for (int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
