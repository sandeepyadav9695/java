package Object;

import java.util.Scanner;

public class FindPower {
     static int power(int base, int expo){
          int i, m=1;
          while(expo!=0){
               m=m*base;
               expo--;
          }
          return m;

     }
     public static void main(String[] args) {
          int base,expo;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a base number ");
          base=sc.nextInt();
          System.out.println("enter a expo number ");
          expo=sc.nextInt();
          if(expo == 0){
               System.out.println("Answer is "+1);
          }else if(base == 0){
               System.out.println("Answer is "+0);
          }else{
              int n= power( base, expo);
              System.out.println("Answer is "+n);
          }

     }
     
}
