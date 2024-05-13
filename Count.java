package Object;

import java.util.Scanner;

public class Count {
     static int countDigit(int n){
              int count = 0;
              while(n!=0){
               n=n/10;
               count++;
              }
              return count;
     }
 
     public static void main(String[] args) {
          int n,ans;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number ");
          n = sc.nextInt();
          ans = sc.nextInt();
          System.out.println(ans);

     }
}
