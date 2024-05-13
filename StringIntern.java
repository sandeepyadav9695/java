package Object;

public class StringIntern {
     public static void main(String[] args) {
          String s1 = new String("rama");
          String s2 = new String();
          s2=s1;
          String s3 = "rama";
          if(s2==s3){
               System.out.println("s1 and s2 are pointing to same object ");
          }
          else{
               System.out.println("s1 and s2 are not ponting to same object");
          }
     }
}
