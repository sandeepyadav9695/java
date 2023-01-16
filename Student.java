public class Student {
     int id,age;
     String name;
     Student(Student s){
          id = s.id;
          name = s.name;
          age = s.age;
     }
 Student(int i,String n,int a1){
           id=i;
           name=n;
           age = a1;
     }
     void display(){
          System.out.println(id+""+name+""+age);
     }
     public static void main(String[] args) {

          Student s1 = new Student(231,"   sandeep yadav  " ,0);
          Student s2 = new Student(232,"   sany   ",21);
          Student s3 = new Student(s1);
          s1.id=s2.id;
          s1.name=s2.name;
          s1.display();
          s2.display();
          s3.display();
     }
    }


// public class Student {
//         String name;
//         int roll_no;
//         static String collegename = "MPU";
//         Student(int r,String n){
//           roll_no=r;
//           name= n;

//         }
//         void display(){
//           System.out.println(roll_no+""+name+"  "+ collegename);
//         }
//         public class Teststaticvariable{
// public static void main(String[] args) {
//      Student s1 = new Student(212, "  sandy");
//      Student s2 = new Student(121,"   sandeep");
//      s1.display();
//      s2.display();
// }

//  }

// }

