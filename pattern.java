import javax.security.auth.kerberos.KerberosCredMessage;

// // package java;
// class pattern{

// public static void main(String[] args) {
//     int k = 1;
//     int m = 2;
//     for (int i = 1; i <= 5; i++) {
//         m = i - 1;
//         while (k != 6 && m != 4) {
//             System.out.print(" ");
//             k++;

//         }

//         for (int j = 1; j <= i; j++) {

//             System.out.print("*");
//         }
//         System.out.println();
//         if (i == 4) {

//             for (int f = 0; f < 5; f++) {

//                 System.out.print("*");
//             }
//         }
//         k = 1;
//     }

//     k = 1;
//     for (int i = 1; i <= 5; i++) {
//         while (k != 6) {
//             System.out.print(" ");
//             k++;

//         }

//         for (int j = 4; j >= i; j--) {

//             System.out.print("*");
//         }
//         System.out.println();
//         k = 1;
//     }

// }
// }



class pattern{
     public static void main(String[] args) {
          int a = 1;
          int b = 2;
          for(int i = 0; i <= 5; i++){
               b = i - 1;
               while(a != 6 && b != 4){
                    System.out.println(" ");
                    a++;
               }
               for(int j = 0; j <= i; j++){
                    System.out.println();
               }
                    if(i == 4){
                         for(int k = 0; k < 5; k++){
                              System.out.println("*");
                              a = 1;
                         }
                    }
                         a++;
                         
                    }
                    for(int i = 1; i <= 5; i++){
                         while(a!=6){
                              System.out.println(" ");
                              a++;
                         }
                         for(int j = 4; j >= i; j--){
                              System.out.println("*");
                         }
                         System.out.println();
                         a = 1;
          }

     }
}



