package Nov.Nov_01112024_OOPs_Constructor;

public class BoxMain {
    public static void main(String[] args) {
        // Box b = new Box(); //1
       // Box b = new Box(10.5, 20.5, 15.5); //2
        Box b = new Box(10.5); //3
        System.out.println(b.volume());
    }
}
