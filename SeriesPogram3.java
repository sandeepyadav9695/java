package Object;

import java.util.Scanner;

public class SeriesPogram3 { 
     static double power(int base, int expo) {
          double pow =1;
          while(expo!=0){
               pow = pow*base;
               expo--;
          }
          return pow;
     }
     static double series(int n, int x){
          int i,j,a=1;
          double sum=0,term;
          for(i=1,j=1; i<=n; i=i+2,j++){
               term = power(x,j)/i*a;
               System.out.print((power(x, j)*a)+"/"+i+" ");
               sum = sum +term;
               a = a*-1;
          }
          return sum;
     }
    
     public static void main(String[] args) {
          int x,n;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the values of x :");
          x = sc.nextInt();
          System.out.print("Entar the values of n :");
          n = sc.nextInt();
          double sum = series(x, n);
          System.out.println("\nsum"+sum);
     }
}
