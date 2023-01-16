// interface Bicycle{
//      int a = 22;
//      void applybreak(int decrement);
//      void speedup(int increament);

// }
//  class AvonCycle implements Bicycle {
//      void blowHorn(){
//           System.out.println("pee pee poo poo");
//      }
//      public void applybreak(int increament) {
//           System.out.println("applying Break");
          
//      }
//      public void speedup(int decrement){
//           System.out.println("Applying speedup");
//      }
     
// }
// public class Interface{
//      public static void main(String[] args) {
//           AvonCycle cyclesandeep = new AvonCycle();
//           cyclesandeep.applybreak(2);
//           System.out.println(cyclesandeep.a);
//      }
// }

interface Car{
     int a = 23;
     void ApplyGare(int increament);
     void Applybreak(int decrement);
     void speedup(int increament);
     void useshandel(int increament);
     
}
interface blowHornCar{
     void blowHorn3g();
     void blowHornmhn();
}
class Thar implements Car, blowHornCar{
      void blowHorn(){
          System.out.println("pee pee poo poo");
     }
     public void ApplyGare(int increament){
          System.out.println("appliying gare.");
     }
     public void Applybreak(int decrement){
          System.out.println("appying break.");
     }
     public void speedup(int increament){
          System.out.println("speedup.");
     }
     public void useshandel(int increament){
          System.out.println("use handel cross: left and right.");
     }
     public void blowHorn3g(){
          System.out.println("kabhi khusi kabhi gam pee pee pee pee");
     }
     public void blowHornmhn(){
          System.out.println("mai hu na poo poo poo");
     }
}
public class Interface{
     public static void main(String[] args) {
          Thar carsandeep = new Thar();
          carsandeep.speedup(2);
          carsandeep.ApplyGare(3);
          carsandeep.Applybreak(04);
          carsandeep.useshandel( 3);
          System.out.println(carsandeep.a);
          carsandeep.blowHorn3g();
          carsandeep.blowHornmhn();
     }
}