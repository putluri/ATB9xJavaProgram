package Oct.ex_22102024_While;

public class Lab073 {
    public static void main(String[] args) {
        String argu_age_string = args[0];
        //Converting String to Int
        int age = Integer.parseInt(argu_age_string);
        System.out.println(age);

        while (age > 0)
        {
            System.out.println(age);
            age--;
        }
    }
}
