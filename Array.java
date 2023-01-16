import java.util.*;
public class Array {
      
     // 2D Array
   
     // public static void main(String[] args) {
     //      Scanner sc = new Scanner(System.in);
     //      int rows = sc.nextInt();  
     //      int cols = sc.nextInt();

     //      int [][]numbers = new int[rows][cols];
     //      for(int i=0;i<rows;i++){
     //           for(int j=0;j<cols;j++){
     //                numbers[i][j] = sc.nextInt();
     //           }
     //      }
     //      int x = sc.nextInt();
     //      for(int i=0;i<rows;i++){
     //           for(int j=0;j<cols;j++){
     //                System.out.print(numbers[i][j] +" ");
     //                if(numbers[i][j]==x){
     //                     System.out.println("x fount at location("+ i +", "+ j +")");
     //                }
     //           }
     //           System.out.println();
     //      }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int row = sc.nextInt();
          int col = sc.nextInt();

          int number[] = new int[row];
          int marks[] = new int[5];
          marks[0] = 87;
          marks[1] = 89;
          marks[2] = 82;
          marks[3] = 85;
          marks[4] = 80;
          for(int i=0;i<row;i++){
               // for(int j=0;j<col;j++){
                   if(number[i]==i){
               // }
         
          System.out.println("x Found at location"+ i);

     }
     }



          // 1D Array


          // Scanner sc = new Scanner(System.in);
          // int size = sc.nextInt();
          // int numbers[] = new int[size];

     //      int marks[] = new int[5];
     // marks[0] = 87;
     // marks[1] = 89;
     // marks[2] = 82;
     // marks[3] = 85;
     // marks[4] = 80;
     // for(int i=0;i<size;i++){
     //      numbers[i] = sc.nextInt();
     // }
     //      int x = sc.nextInt();
     // for(int i=0;i<5;i++){
     //      if(numbers[i]==x){
     //           System.out.println("find the value of x: " +i);
     //      }
         
     // }

     }
}
