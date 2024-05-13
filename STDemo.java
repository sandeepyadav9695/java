package Object;

import java.util.Scanner;
import java.util.StringTokenizer;

public class STDemo {
   
     public static void main(String[] args) { 
          String s1 ;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the string : ");
          s1 = sc.nextLine();          
          StringTokenizer st = new StringTokenizer(s1,"a");
          while(st.hasMoreTokens()){
             String token = st.nextToken();
             char[] Tokens;
          System.out.println(token); 
          }
     }
}
