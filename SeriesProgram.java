package Object;

import java.util.Scanner;

public class SeriesProgram {
     static int series(int n){
          int i, sum =0;
          for(i=1; i<=n; i++){
               System.out.print(i+" ");
               sum = sum + i;
          }
          return sum;
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int n = sc.nextInt();

          // int sum = series(n);
          // System.out.println(sum);
          System.out.print("\n"+series(n));

          
     }
}
