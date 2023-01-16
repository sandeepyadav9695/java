// public class polysphism {
//     static int add(int a , int b){
//      return a+b;
//     }
//     static int add(int a,int b,int c){
//      return a+b+c;
//     }
// }
// class test{
//      public static void main(String[] args) {
//           System.out.println(polysphism.add(11,22));
//           System.out.println(polysphism.add(12,23,33));
//      }
// }





// public class polysphism{
//      static int add(int a,int b){return a+b;}
//      static double add(double a,double b, double c){return a+b+c;}
// }
// class test{
//      public static void main(String[] args) {
//           System.out.println(polysphism.add(11,33));
//           System.out.println(polysphism.add(12.0,23,45));
//      }
// }





// class polysphism{
//      public static void main(String[] args) {
//           System.out.println("main class in java");
//      }
//      public static void main(String args) {
//           System.out.println("main class in java");
//      }
//      public static void main() {
//           System.out.println("main class in java");
//      }
// }




// class polysphism{
//      void sum (int a,long b){
//           System.out.println(a+b);
//      }
//      void sum (int a,int b,int c){
//           System.out.println(a+b+c);
//      }
// }
// class test{
//      public static void main(String[] args) {
//           polysphism py= new polysphism();
//           py.sum(12, 32, 33);
//           py.sum(12, 32);
//      }
// }



// class polysphism{
//      void run(){
//           System.out.println("Vehical is runing ");
//      }
     
// }
// class Bike extends polysphism{
//      void run(){
//           System.out.println("Vehical is runing sefely");
//      }
//      public static void main(String[] args) {
//           Bike b1 = new Bike();
//           b1.run();
//      }
// }

// class polysphism{
//      int getRateOfIntrest(){
//           return 0;
//      }
// }
// class SBI extends polysphism{
//      int getRateOfIntrest(){
//           return 8;
//      }
// }
// class HDFC extends polysphism{
//      int getRateOfIntrest(){
//           return 9;
//      }
// }
// class ICICI extends polysphism{
//      int getRateOfIntrest()
//      {
//           return 7;
//      }
// }
// class KOTAK extends polysphism{
//      int getRateOfIntrest(){
//           return 10;
//      }
// }
// class test{
//      public static void main(String[] args) {
//           SBI s = new SBI();
//           HDFC h = new HDFC();
//           ICICI i = new ICICI();
//           KOTAK k = new KOTAK();
//           System.out.println("Get intrence of SBI "+s.getRateOfIntrest());
//           System.out.println("Get intrence of HDFC "+h.getRateOfIntrest());
//           System.out.println("Get intrence of ICICI "+i.getRateOfIntrest());
//           System.out.println("Get intrence of KOTAK "+k.getRateOfIntrest());
//      }
// }

// .................verrider................


// class polysphism{
//      polysphism get(){
//           return this;
//      }
// }
// class A extends polysphism{
//      A get(){
//           return this;
//      }

// void message(){
//      System.out.println("welcome to my program");
// }
// public static void main(String[] args) {
//      new A().get().message();
// }
// }


// ............overriding,,,,,,,

// class polysphism{
//      polysphism foo(){
//           System.out.println("learn polsphism");
//           return this;
//      }
//      void print(){
//           System.out.println("Inside the class polysphism");
//      }
//      @Override
//      public String toString() {
//           return "polysphism []";
//      }
// }
// class A extends polysphism{
//      A foo(){
//           return this;
//      }
//      void print(){
//           System.out.println("Inside the class A");
//      }
// }

// class B {
//      // @Override 
//      B foo(){
//           return this;
//      }
//      void print(){
//           System.out.println("Inside the class B");
//      }
// }
//  class test{
//      public static void main(String[] args) {
//           polysphism p = new polysphism();

//           p.foo().print();

//           A a = new A();
//          a.foo().print();

//           B b = new B();
//           b.foo().print();
          
//      }
// }


// .........Super Keyword in Java............

class polysphism{
     polysphism (int a)
     {
          System.err.println("hello viewer "+a);
      }


}
class A extends polysphism{
     A()

     {
          super(100);
          System.out.println("learn java program");
          
     }

}
class test{
     public static void main(String[] args) {
          A a = new A();
          
     }
}