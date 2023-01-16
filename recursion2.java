public class recursion2{
     public static void subsecuquences(String str, int idx, String newString) {
          if(idx ==str.length()){
               System.out.println(newString);
               return;
          }

          char currchar =str.charAt(idx);

          // to be
          subsecuquences(str, idx+1, newString+currchar);

          // or not to be
          subsecuquences(str, idx+1, newString);
          
     }
     public static void main(String[] args) {
          String str ="abc";
          subsecuquences(str, 0, "");
     }

}