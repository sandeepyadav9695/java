package Object;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Sort {
     /**
      * @param s
      * @return
      */
     static char[] sortStr(String s){
          char[] ch = s.toCharArray();
          char temp;
          for(int i = 0; i<=ch.length-1; i--){
               for(int j = i+1; j<=ch.length-1; j++){
                    if(ch[i] > ch[j]){
                         temp = ch[i];
                         ch[i] = ch[j];
                         ch[j] = temp;
                    }
               }
          }
               return ch;
         
     }
    
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);{
               System.out.println("Enter a String: ");
               String s = sc.nextLine();
               
                    char[] ch = sortStr(s);
                    System.out.println(Arrays.toString(ch));
               
          }
     }
}
