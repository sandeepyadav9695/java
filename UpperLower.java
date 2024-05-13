package Object;

import java.util.Scanner;

public class UpperLower {
     static String upToLow(String s){
     String newStr="";
     for(int i=0; i<=s.length()-1; i++){
           newStr = newStr +(char)(s.charAt(i)+32);
     }
     return newStr;
}
     public static void main(String[] args) {
          String s= "ABCD";
          Scanner sc = new Scanner(System.in);
          System.out.println(" Enter a string : ");
           s = sc.nextLine();
          System.out.println(upToLow(s));
          

     }
}
