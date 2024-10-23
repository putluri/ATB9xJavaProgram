package Oct.ex_18102024_IfCondition_Switch;

public class Lab050 {
    //JDK > 13
    public static void main(String[] args) {
        int itemCode = 001; //JDK > 13

        switch (itemCode){
            case 1 -> System.out.println("001");
            case 2 -> System.out.println("002");
            case 3 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
