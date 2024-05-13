package Object;

public class StringDemo1 {
     public static void main(String[] args) {
          String s1= new String("sita");
          String s4 = new String("rama");

          String s2 = "sita"+"ram";
          String s3 = "sita"+"ram";
          String s5 = s2+s3;
          String s6 = s2+s3;
          System.out.println(s1);
          System.out.println(s2);
          if(s1.equals(s2)){
               System.out.println("both string are equle");
          }
          else{
               System.out.println("both string are not equle");
          }
          if(s1==s4){
                      System.out.println("refference is the same ");
          }
          else{
               System.out.println("refference is not same");
          }

          System.out.println(s2);
          System.out.println(s3);
          System.out.println(s5);
          if(s2==s3){
               System.out.println("Both string are pointing to same bject");
          }
          else{
               System.out.println("Both reference are not pointing to same object");
          }
          System.out.println(s5);
          System.out.println(s6);
          if(s5==s6){
               System.out.println("Both string are pointing to same bject");
          }
          else{
               System.out.println("Both reference are not pointing to same object");
          }

          String s7 = "sita"+s4;
          String s8 = s1+"ram";
          System.out.println(s7);
          System.out.println(s8);
          if(s7==s8){
               System.out.println("Both string are pointing to same bject");
          }
          else{
               System.out.println("Both reference are not pointing to same object");
          }
          







          
     }
     // public static void main(String[] args) {
     //      String s1 = new String("Rama");
     //      String s2 = "Sita";
     //      String s3 = s1+s2;
     //      String s4 = s1+"Sita";
     //      System.out.println(s3);
     //      System.out.println(s4);
     //      s3=s1+s2;
     //      s4=s1+s2;

         
     //      if(s3==s4){
     //           System.out.println("both are string equal");
     //      }
     //      else{
     //           System.out.println("both are not equal");
     //      }
          
     // }


}

















