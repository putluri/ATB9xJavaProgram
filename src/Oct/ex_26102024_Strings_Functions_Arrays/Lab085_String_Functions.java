package Oct.ex_26102024_Strings_Functions_Arrays;

public class Lab085_String_Functions {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        // substring - many interviews
        String s1 = "Arjun";
        String s2 = s1.concat(" Dutta");
        System.out.println(s2);

        // Split function example with fruits
        String fruits = "apple,banana,cherry"; // delimiter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]); // apple
        System.out.println(split_fruits[1]); // banana
        System.out.println(split_fruits[2]); // cherry

        // Split function example with a different delimiter
        String fruits2 = "ABC-XYZ-QWE"; // delimiter = -
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]); // ABC
        System.out.println(split_fruits2[1]); // XYZ
        System.out.println(split_fruits2[2]); // QWE

        String s4 = "Arjun";
        System.out.println(s4.charAt(0)); // A
        // System.out.println(s4.charAt(10)); // Uncommenting will throw StringIndexOutOfBoundsException

        String s5 = " Arjun ";
        System.out.println(s5.trim()); // Arjun

        String s6 = "Arjun";
        System.out.println(s6.indexOf("r")); // 1
        System.out.println(s6.indexOf("n")); // 4

        String s7 = "Arjun";
        System.out.println(s7.contains("rj")); // true
        System.out.println(s7.contains("zy")); // false

        String s8 = "Pramoddutta";
        System.out.println(s8.lastIndexOf("d")); // 6

        String s9 = "Pramoddutta";
        System.out.println(s9.replace("d", "z")); // Pramozzutta

        String s10 = "Pramodduttaji";
        System.out.println(s10.startsWith("Pra")); // true
        System.out.println(s10.endsWith("ji")); // true
        System.out.println(s10.endsWith("zy")); // false

        String original = "banana";
        String result1 = original.replace("a", "o");
        System.out.println(result1); // bonono

        String original1 = "Hello123 world456";
        String result2 = original1.replaceAll("\\d+", "");
        System.out.println(result2); // Hello world

        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3); // HellO123 wOrld456
    }
}
