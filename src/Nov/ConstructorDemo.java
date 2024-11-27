package Nov;

public class ConstructorDemo {
    int x,y;
    ConstructorDemo () //default constructor
    {
        x=100;
        y=200;
    }

    ConstructorDemo (int a, int b) //parameterised constructor
    {
        x=10;
        y=20;
    }

    void sum()
    {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
      //  ConstructorDemo cd=new ConstructorDemo(); //invoke default constructor
        ConstructorDemo cd=new ConstructorDemo(10,20); //invoke parameterised constructor
        cd.sum();
    }
}
