package Nov.Nov_Encapsulation;

public class AccountMain {
    public static void main(String[] args) {
    Account acc  = new Account();
      acc.setAccno(1234);
      acc.setName("Raj");
      acc.setAmount(5000);
      System.out.println(acc.getAccno());
      System.out.println(acc.getName());
      System.out.println(acc.getAmount());
    }
}
