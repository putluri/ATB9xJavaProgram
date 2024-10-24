package Oct.ex_23102024_Functions;

public class Lab079 {
    public static void main(String[] args) {
        //User defined functions
        //
        //1. Without parameters and Without Return type
        // greet();
        for (int i = 0; i < 5; i++) {
            greet();
        }

        //2. With parameters and With Return type
        String returned_value = greet_with_hello();
        System.out.println(returned_value);

        int voting_age = age_of_vote();
        System.out.println(voting_age);
        if (voting_age >= 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

        //3. Return type and Without Return type
        greet_with_your_name("Arjun");
        greet_with_your_name("Shiva");
        greet_with_your_name("Kishore");
        greet_with_first_name_last_name("Arjun ","Putluri");

        //4. Return type with parameters and With Return type
        int result = sum_of_two_numbers(6, 8);
        System.out.println(result);
    }

    //1. Without parameters and Without Return type
    static void greet()
    {
        System.out.println("Hi, How are you?");
    }

    //2. With parameters and With Return type
    static String greet_with_hello()
    {
        //Write the code
        System.out.println("Hi, I am type2");
        return "Hi, You are awesome";
    }

    static int age_of_vote()
    {
        //Write the code
        System.out.println("Vote age returned");
        return 18;
    }

    //3. Return type and Without Return type
    static void greet_with_your_name(String name)
    {
        System.out.println("Your name is "+ name);
    }
    static void greet_with_first_name_last_name(String firstname, String lastname)
    {
        System.out.println("Your name is "+ firstname+" "+lastname);
    }

    //4. Return type with parameters and With Return type
    static int sum_of_two_numbers(int a, int b)
    {
        return a+b;
    }
}
