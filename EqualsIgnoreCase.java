package Object;

public class EqualsIgnoreCase {
     public static void main(String[] args) {
          String s1 = "rama";
          String s2 = "RAMA";
          if(s1.equalsIgnoreCase(s2)){
               System.out.println("both string are equals");

          }else{
               System.out.println("both string are not equals");
          }
     }
}
