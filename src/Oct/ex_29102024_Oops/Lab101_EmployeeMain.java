package Oct.ex_29102024_Oops;

public class Lab101_EmployeeMain {
    public static void main(String[] args) {
        Lab100_Employee emp = new Lab100_Employee();
        emp.eid = 101;
        emp.ename = "Arjun";
        emp.job = "Manager";
        emp.sal = 50000;
        emp.display();

        Lab100_Employee emp1 = new Lab100_Employee();
        emp1.eid = 102;
        emp1.ename = "Shiva";
        emp1.job = "Engineer";
        emp1.sal = 3000;
        emp1.display();
    }
}