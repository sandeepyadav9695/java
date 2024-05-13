package Object;

import java.util.Scanner;

public class ArmStrongNumber{
     static int countDigits(int num){
          int count = 0;
          while(num!=0){
               num = num/10;
               count++;
          }
          return count;
     }
        static int power(int base int expo){
          int pow = 1;
          while(expo!=0){
               pow = pow*base;
               expo--;
          }
          return pow;
     }
     static boolean checkArmStrong(int num){
          int sum=0,rem=0,temp=num;
          int len = countDigits(num);
          while(num!=0){
               rem = num%10;
               sum= sum+power(rem);
               num = num/10;
          }
          return temp == sum;
     }
     public static void main(String[] args) {
          int num;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number: ");
          num = sc.nextInt();
          // System.out.println(countDigite(12345));
          if(checkArmStrong(num)){
               System.out.println(num+" is an aemstrong number.");
          }else{
               System.out.println(num+" is an not armstrong number.");
          }

     }
     
}
