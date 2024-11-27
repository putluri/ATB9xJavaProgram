package Nov;

public class StudentMain {
    public static void main(String[] args) {
     // Student stu = new Student();
      // 1) Using reference variable
   /*   stu.sid = 101;
      stu.sname = "Raj";
      stu.grad = 'A';  */

     // 2) Using Method
    //    stu.setStudentData(101, "Raj", 'A');
     //   stu.printStudentData();

      // 3) Using Constructor
        Student stu = new Student(101, "Kamlesh", 'A');
            stu.printStudentData();
    }
}
