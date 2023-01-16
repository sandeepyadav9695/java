// public class inheritance {
//      float salary = 23000;
// }
// class pyment extends inheritance{
//      int bonus = 2000;
//      public static void main(String[] args) {
//           pyment i = new pyment();
//           System.out.println("salary "+ i.salary);
//           System.out.println("bonus "+ i.bonus);
//      }

// }

// // .................singal inheritance........

// class inheritance{
//      void eat(){
//          System.out.println("Eating");
//      }
// }
// class singalInheritance extends inheritance{
//      void food(){
//           System.out.println("eating the food");
//      }
// }
// class test3{
//      public static void main(String[] args) {
//           singalInheritance si = new singalInheritance();
//           si.eat();
//           si.food();
//           }
// }



// .............multi level inheritance...........




// class inheritance{
//      void read(){
//           System.out.println("reading...");
//      }
// }
// class multilevelInheritance extends inheritance{
//      void book(){
//           System.out.println("reading book.......");
//      }
// }
// class multilevelInheritance2 extends multilevelInheritance{
//      void math(){
//           System.out.println("reading the mathmatics book........");
//      }
// }
// class testInheritance{
//      public static void main(String[] args) {
//           multilevelInheritance2 mu = new multilevelInheritance2();
//           mu.read();
//           mu.book();
//           mu.math();
//      }
// }


// ............hierachical..........
class inheritance{
     void beta(){
          System.out.println("son....");
     }
}
class hierichcalInheritance extends inheritance{
     void bap(){
          System.out.println("father.....");
     }
}
class hierichcalInheritance2 extends inheritance{
     void dada(){
          System.out.println("grandfather......");
     }
}
class testInheritance3{
     public static void main(String[] args) {
         hierichcalInheritance2 hi = new hierichcalInheritance2();
         hi.beta();
     //     hi.bap(); find error
         hi.dada();

     }
}
