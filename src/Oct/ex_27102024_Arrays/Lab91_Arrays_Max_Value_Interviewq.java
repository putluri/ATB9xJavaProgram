package Oct.ex_27102024_Arrays;

public class Lab91_Arrays_Max_Value_Interviewq {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max_value = give_max(array);
        int min_value = give_min(array);

        // Use printf for formatted output
        System.out.printf("Max value is %d%n", max_value);
        System.out.printf("Min value is %d%n", min_value);
    }

    static int give_max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) { // Start from i = 1
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) { // Start from i = 1
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
