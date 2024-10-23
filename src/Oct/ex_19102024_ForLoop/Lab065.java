package Oct.ex_19102024_ForLoop;

public class Lab065 {
    public static void main(String[] args) {
        //To find the even numbers from 0to 50
        for (int i = 0; i <= 50; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            else
                System.out.println("Odd");
        }
    }
}
