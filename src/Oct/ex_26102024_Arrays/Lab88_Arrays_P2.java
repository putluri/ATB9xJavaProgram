package Oct.ex_26102024_Arrays;

public class Lab88_Arrays_P2 {
    public static void main(String[] args) {
        // Creation, size - Fix
        int [] marks_2 = new int[5]; //Fixed size
        System.out.println(marks_2.length);
        marks_2[0] = 11;
        marks_2[1] = 12;
        marks_2[2] = 13;
        marks_2[3] = 14;
        marks_2[4] = 15;
        System.out.println(marks_2[0]);
        System.out.println(marks_2[1]);
        System.out.println(marks_2[4]);
        // System.out.println(marks_2[-1]); //ArrayIndexOutOfBoundsException
        // System.out.println(marks_2[10]); //ArrayIndexOutOfBoundsException
    }
}
