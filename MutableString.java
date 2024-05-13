package Object;

import java.util.Scanner;

public class MutableString {
     public static void main(String[] args) {
          // String s;
          // Scanner sc = new Scanner(System.in);
          // System.out.println("Enter the string: ");
          // s = sc.nextLine();  
          StringBuilder s1 = new StringBuilder();
          StringBuffer s2 = new StringBuffer();
          System.out.println(s1.capacity());
          System.out.println(s1.length());
          s1.append("Sachin");
          s1.append("is a great batman");
          System.out.println(s1.capacity());
          System.out.println(s1.length());
          s2.append("Dhoni");
        }
}
