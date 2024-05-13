package Object;

import java.util.Scanner;

public class SeriesProgram2 {
     static int series(int n){
          int i, sum = 0,c;
          for(i=1; i<=n;i++){
               c= i*i;
               System.out.print(c+" ");
               sum = sum + c;
          }
          return sum;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Entera number ");
          int n = sc.nextInt();

          System.out.println("\n"+series(n));
          }
     
}
