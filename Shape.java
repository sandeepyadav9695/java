// abstract class Shape {
//      abstract void draw();
// }
// class Rectangle extends Shape{
//      void draw(){
//           System.out.println("Drawing rectangle");
//      }
// }
//      class Circle extends Shape{
//           void draw(){
//                System.out.println("DRaw cicurle");
//           }
//      } 
// class testAbstraction{
//      public static void main(String[] args) {
//           Shape a1 = new Circle();
           
//           a1.draw();
//      }
// }

// // .......................BANK................

// abstract class Shape{
//      abstract int getRateOfIntrest();
// }
// class SBI extends Shape{
//      int getRateOfIntrest(){
//           return 7;
//      }
// }
// class PNB extends Shape{
//      int getRateOfIntrest(){
//           return 8;
//      }
// }
// class Test2{
//      public static void main(String[] args) {
//      Shape b;
//      b= new SBI();
//      System.out.println(" Get Rate OF Intreated  "+b.getRateOfIntrest()+"%"); 
//      b=new PNB();
//      System.out.println("Get Rate Of Instrest  "+b.getRateOfIntrest()+"%");
//      }
// }


// .......................Bike...................

// abstract class Shape{
//      Shape(){
//           System.out.println("Creating bike");
//      }
//      abstract void run();
//       void ChangeGear(){
//           System.out.println("change gear");
//      }  
// }
// class Honda1 extends Shape{
//      void run(){
//           System.out.println("runing");
//      }
// }
// class test3{
//      public static void main(String[] args) {
//           Shape s2 = new Honda1();
//           s2.run();
//           s2.ChangeGear();
//      }
// }


// ...........................Another real scenario of abstract class............


interface Shape{
     void a();
     void b();
     void c();
     void d();
}
abstract class B implements Shape{
     public void c(){
          System.out.println("I am c");
     }
}
class M extends B{
     public void a(){System.out.println("I am A");}
     public void b(){System.out.println("I am B");}
     public void d(){System.out.println("I am D");}
}
class test4{
     public static void main(String[] args) {
          Shape a = new M();
          a.a();
          a.b();
          a.c();
          a.d();
     }
}