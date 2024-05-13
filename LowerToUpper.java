package Object;

import java.util.Scanner;

public class LowerToUpper {
     static String lowerToUpperCase(String s){
          String newStr="";
          for(int i = 0; i<=s.length(); i++){
               newStr = newStr+(char)(s.charAt(i)-32);
          }
          return newStr;
     }
     public static void main(String[] args) {
          String s = "abcd";
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter a string: ");
          s = sc.nextLine();
          System.out.println(lowerToUpperCase(s));

          
     }
}
