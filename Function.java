import java.util.Scanner;

import java.util.*;

// public class Function{
//      public static int culculate(int a,int b){
         
//           int sum = a+b;
//           return sum;
//      }
//      public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           int a = sc.nextInt();
//           int b = sc.nextInt();

//           int sum = culculate(a,b);
//           System.out.println("sum of two number :"+ sum);

//      }
// }
// class HelloWorld {
//      public static void main(String[] args) {
//          System.out.println("Hello, World!");
//      }
//  }
          
//  class Employee{  
//      float salary=40000;  
//     }  
//     class Programmer extends Employee{  
//      int bonus=10000;  
//      public static void main(String args[]){  
//        Programmer p=new Programmer();  
//        System.out.println("Programmer salary is:"+p.salary);  
//        System.out.println("Bonus of Programmer is:"+p.bonus);  
//     }  
//     }  

public class Function{
     
     public static int culculateProduct(int a,int b){
     
     return a*b;
}

public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
    

     System.out.println("multiplication of two number:" +culculateProduct(a, b));


}
}
