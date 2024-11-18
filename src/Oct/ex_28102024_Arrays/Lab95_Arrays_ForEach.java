package Oct.ex_28102024_Arrays;

public class Lab95_Arrays_ForEach {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

//        for (int i=0; i< a.length; i++){
//            System.out.println(a[i]);
//        }

        for(int i:a)
        {
            System.out.println(i);
        }

        String[] names = {"Arjun", "Shiva", "Ram", "Shyam", "Hari"};
        for (String name: names)
        {
            System.out.println(name);
        }

        int [] numbers = {1, 2, 3, 4, 5};
        for (int num: numbers)
        {
            System.out.println(num);
        }
    }
}
