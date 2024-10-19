package Task.Task_16102024;

public class task_16102024 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        //In future we will ask the user for these values
        //We will take a user input

        //Rough Logic
        //a>=b && a>=c -> a:b >=c -> b:c

        int result = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Max number is -> " + result);

    }
}
