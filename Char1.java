package Object;

import java.util.Scanner;

// import javax.swing.event.SwingPropertyChangeSupport;

public class Char1 {
     static void retrieveChar(String s){
     for(int i=0;i<=s.length()-1; i++){
          System.out.print(s.charAt(i)+" ");
     }
}
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter a string : ");
          String s = sc.nextLine();
          retrieveChar(s);

     }
}
