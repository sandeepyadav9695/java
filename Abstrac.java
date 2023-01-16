abstract class Abstrac{
     abstract void run();
}
     class Hond extends Abstrac{
          void run(){
               System.out.println("runing sefely");
          }

     public static void main(String[] args) {
          Abstrac obj = new Abstrac();
          obj.run();
          // int a = 21;
          // String name = "sandep";

          // System.out.println(a);
          // System.out.println(name);
     }
   }  
