package Nov;

public class Greetings {
//1) No params No return value
    void m1(){
        System.out.println("Hello, Good Morning");
    }
    //2) No params Return value
   String m2(){
        return "Hello, How are you?";
    }

    //3) Take params No return value
    void m3(String name){
        System.out.println("Hello, "+name+" Good Morning");
    }

    //4) Take params and return value
    String m4(String name){
        return "Hello, "+name+" How are you?";
    }
}
