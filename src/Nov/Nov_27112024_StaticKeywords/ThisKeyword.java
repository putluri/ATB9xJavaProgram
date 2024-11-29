package Nov.Nov_27112024_StaticKeywords;

public class ThisKeyword {
    int x,y;  // class variables or instance variables
      /* ThisKeyword(int x, int y){
         this.x=x;
         this.y=y;
    } */
     void setData(int a, int b){
        x=a;
        y=b;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
         //  ThisKeyword th = new ThisKeyword(100,200);
        ThisKeyword th = new ThisKeyword();
        th.setData(100,200);
        th.display();

    }
}
