package Object;

import java.util.Scanner;

public class CompareTo {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter 1st String");
          String s1 = sc.next();
          System.out.println("Enter 2nd string ");
          String s2 = sc.next();
          int r = s1.compareTo(s2);
          System.out.println(r);
          System.out.println();
          if(r==0){
               System.out.println("both string are equl ");

          }
          else if(r<0){
               System.out.println("s1 is less tha s2 ");
          }
          else if(r>0){
               System.out.println("s1 is grether than s2");
          }
          






          
     }
}
