package Oct.ex_18102024_IfCondition_Switch;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        // Web Automation
        //I will ask user which browser you want me to run the code.
        //Chrome -> excecute chrome
        //firefox -> excecute firefox
        //edge -> excecute edge

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        switch (browser){
            case "chrome" :
                System.out.println("Starting the chrome");
                System.out.println(".....");
                System.out.println("TC");
                break;
            case "firefox" :
                System.out.println("Starting the firefox browser");
                System.out.println(".....");
                System.out.println("TC");
                break;
            case "edge" :
                System.out.println("Starting the edge code");
                System.out.println(".....");
                System.out.println("TC");
                break;

        }
    }
}
