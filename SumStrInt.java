package Object;

import java.util.Scanner;

public class SumStrInt {
     
     static String SumDigits(String s){
     String newstr="";
     int sum = 0;
     for(int i =0; i<=s.length()-1; i++){
          if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
          {
               sum = sum +(int)(s.charAt(i)-48);
          }
          else{
            newstr =newstr + s.charAt(i);
          }
     }
     return newstr+sum;
}

     public static void main(String[] args) {
          String s ;
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter a string: ");
          s = sc.nextLine();
          System.out.println(SumDigits(s));
          
     } 
     
}
