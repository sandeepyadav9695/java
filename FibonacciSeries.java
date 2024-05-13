package Object;

import java.util.Scanner;

public class FibonacciSeries {
    
          
     
     static void FibSeries(int count){
          
          int n1=0,n2=1,n3,n;
          System.out.println(n1+" "+n2);
          
          for(n=2;n<=count;n++){
               n3=n1+n2;
               System.out.print(" "+n3);
               n1=n2;
               n2=n3;

          }
      }
       public static void main(String[] args) {
          int count;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number ");
          count = sc.nextInt();
          FibSeries(count);

}
}
