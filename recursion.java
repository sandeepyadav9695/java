public class recursion {



// }
     // remove duplicate in String


     public static boolean[] map = new boolean[26];

     public static void removeDuplicates(String str, int idx, String newString) {
          if(idx == str.length()){
               System.out.println(newString);
               return;
          }
          char currChar = str.charAt(idx);
          if(map[currChar - 'a']){
               removeDuplicates(str, idx+1, newString);
          }else{
               newString += currChar;
               map[currChar - 'a'] = true;
               removeDuplicates(str, idx + 1, newString);

          }
          
     }
     public static void main(String[] args) {
          String str = "abbccda";
          removeDuplicates(str,0,"");
          
     }

          
     
}

     // X power N static height logn
     
//      public static int calcPower(int x, int n){
//           if(n==0){
//                return 1;
//           }
//           if(x==0){
//                return 0;
//           }
//           // if n is even 
//           if(n%2==0){
//           return calcPower(x, n/2) *  calcPower(x, n/2);
//           }
//           // if n is odd 
//           else{
//                return calcPower(x, n/2) *  calcPower(x, n/2)  * x;

//           }
//      }
//      public static void main(String[] args) {
//           int x = 2 , n = 5;
//           int Sandeep =calcPower(x, n);
//           System.out.println("x power n is : " + Sandeep); 
//      }
// }




// // X power N static height N 

     // public static int calcPower(int x, int n){
//           if(n==0){
//                return 1;
//           }
//           if(x==0){
//                return 0;
//           }
//           int xpownm1 = calcPower(x, n-1);
//           int xPown = x*xpownm1;
//           return xPown;

//      }
//      public static void main(String[] args) {
//           int x = 5 , n = 0;
//           int Sandeep =calcPower(x, n);
//           System.out.println("x power n is : " + Sandeep); 
//      }


// }

     // factorial


     // public static int printFact(int n) {
     //      if(n==1||n==0){
     //           return 1;
     //      }
     //      int fact_nm1 = printFact(n-1);
     //      int fact_n = n*fact_nm1;
     //      return fact_n;
          
     // }
     // public static void main(String[] args) {
     //      int n = 8;
     //      int Sandeep = printFact(n);
     //      System.out.println( "Factorial number is : "+ Sandeep);
     // }
          
     // }



     // fibonic series


     // public static void printFib(int a,int b,int n) {
     //      if(n==0){
     //           return;
     //      }
     //      int c = a + b;
//           System.out.println(c);
//           printFib( b, c, n-1);
          
//      }
//      public static void main(String[] args) {
//           int a = 0, b = 1;
//           System.out.println(a);
//           System.out.println(b);
//           int n = 7;
//           printFib( a, b, n-2);
//      }

// }




// sum 


//      public static void printSum(int i,int n,int sum){
//           if(i==n){
//                sum+=1;
//                System.out.println(sum);
//                return;
//           }
//           sum+=1;
//           printSum(i+1,n,sum);
//           System.out.println(i);
//      }
//  public static void main(String args[]){
//       printSum(1,5,0);
//  }

// }




// print numbers


// public static void printNumber(int n){
//           if(n==6){
//                return;
//           }
//           System.out.println(n);
//           printNumber(n+1);
//      }
//           public static void main(String args[]){
//                int n=1;
//                printNumber(n);
       
//           if(n == 0){
//           return;
//      }
//      System.out.println(n);
//      printNumber(n-1);


// }
          
// }








// public static void main(String args[]){
//      int n = 5;
//      printNumber(n);



