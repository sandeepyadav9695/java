package Object;

import java.util.Scanner;

public class SwapCase {
     static String swapLetterCases(String s){
          String newStr="";
          for(int i=0; i<=s.length()-1; i++){
               //capital letter
               if(s.charAt(i)>=65 && s.charAt(i)<=90){
                    newStr = newStr+(char)(s.charAt(i)+32);
               }//small letter
               else if(s.charAt(i)>=97 && s.charAt(i) <=122){
                    newStr = newStr +(char)(s.charAt(i)-32);
               } 
             else{
                  newStr = newStr+s.charAt(i);
                   }
               
          }
          return newStr;

     }
     
     public static void main(String[] args) {
          String s = "AbCd";
          Scanner sc =new Scanner(System.in);
          System.out.println("Enter a string: ");
          s = sc.nextLine();
          System.out.println("Original string : "+s);
     }
}
