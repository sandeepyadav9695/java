import java.util.Scanner;

public class F {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(10);
          int a = 0, b = 1, c; 
          for (int i = 1; i <= n; i++) {
               c = a + b;
               System.out.println(c);
               a = b;
               b = c;

          }

          // System.out.println("a = "+a+" b = "+b);
          // b=(a+b)-(a=b);
          // // a+=b-(b=a);
          // // a=a*b/(b=a);
          // // a=a^b^(b=a);
          // System.out.println("a = "+a+" b = "+b);

          // for (int i = 0; i <= a; i++) {
          // // System.out.println(i+i);
          // System.out.println(i+i-1);
          // }

     }
}
