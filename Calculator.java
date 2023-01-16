import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;
class Calculator {
    
     
     public static void main(String[] args) {
          System.out.println("Pracentage of student:");
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Subject first Hindi: ");
          float a = sc.nextFloat();
          System.out.println("Subject second English: ");
          float b = sc.nextFloat();
          System.out.println("Subject third Physics: ");
          float c = sc.nextFloat();
          System.out.println("Subject fourth chemistry: ");
          float d = sc.nextFloat();
          System.out.println("Subject fifth Maths: ");
          float e = sc.nextFloat();
          float pracentage = (a+b+c+d+e)/5;
          System.out.println(pracentage);




          





          // ......................................marks...................................

          // int n,total=0,pracentage;
          // Scanner sc = new Scanner(System.in);
          // System.out.println("enter the number: ");
          // n = sc.nextInt();
          // int marks[] = new int[n];
          // System.out.println("enter marks out of 100: ");
          // for(int i=0; i<n; i++){
          //      marks[i] = sc.nextInt();
          //      total = total + marks[i];
          // }
          // pracentage = total / n;
          // System.out.println("sum:"+total);
          // System.out.println("parcentage:"+pracentage);




//   ........................Operator..........................................

     //      char operator;
     //      Double  num1,num2,result;
     //     Scanner input = new Scanner(System.in);
     //     System.out.println("choese operator: +,-,*or/");
     //     operator = input.next().charAt(0);
     //     System.out.println("enter the first number: ");
     //     num1 = input.nextDouble();
     //     System.out.println("enter second number: ");
     //     num2 = input.nextDouble();

     //     switch(operator){
     //      case '+':
     //      result = num1 + num2;
     //      System.out.println(num1 + " + " + num2 + " = "+ result );
     //      break;
     //      case '-':
     //      result = num1 - num2;
     //      System.out.println(num1 + " - " + num2 + " = " + result);
     //      break;
     //      case '*':
     //      result = num1 * num2;
     //      System.out.println(num1 + " * " + num2 + " = " + result);
     //      break;
     //      case '/':
     //      result = num1 / num2;
     //      System.out.println(num1 + "/" + num2 + "=" + result);
     //      break;
     //      default:
     //      System.out.println("invalid choose");

     //     }
     //     input.close();

     }
}
