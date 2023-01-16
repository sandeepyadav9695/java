import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class second{

    public static <am> void main(String[] args) {

        String quote = "I am parsuing BSC IT final year V sem.";
        String[] city = {"Jaunpur", " Varansi", "Pragraj", "Agara"};
        int[] num = {96, 95, 32, 70, 39, 93, 26, 58, 03, 18};
        city[3] = "Bhadohi";
        String[][] village = {{"Puredayal", "Rajapur", "Sorha", "Bauriya", "Phatnpur"},{"Kaseru", "Kakopur", "Patti", "Bisenipur", "Marikpur"}};
        int[][] coll = {{81, 69, 58, 33, 20},{90, 44, 31, 66, 86}};
        village[1][3] = "Rampur";


        System.out.println(quote.length());
        System.out.println(quote.indexOf("IT"));
        System.out.println(quote.toUpperCase());
        System.out.println(quote.toLowerCase());
        System.out.println("Hi How are you, \n I am fine ");
        System.out.println("Age : \t21");
        System.out.println("san\\doc\\png.");
        System.out.println("Address \b: Jaunpur");
        System.out.println("Lenth of city : "+city.length);
        System.out.println("Lenth of num : " + num.length);
        System.out.println(city[3]);
        System.out.println(num[5]);
        System.out.println("Lenth of village :" +village.length);
        System.out.println("Lenth of coll : " + coll.length);
        System.out.println(village[1][3]);
        System.out.println(coll[1][2]);

        for(int i=0; i<coll.length; i++){
            for(int j=0; j<coll[1].length; j++){
                System.out.print(coll[i][j] + "\t");
            }
            System.out.println();
        }

        for(String i : city){
            System.out.println(i);

        }
        for(int j : num){
            System.out.println(j);
        }
        for(int i=0; i<city.length; i++){
            System.out.println(city[i]);
        }

       



        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size]; 
   
    int marks[] = new int[5];
    marks[0] = 67;
    marks[1] = 87;
    marks[2] = 75;
    marks[3] = 79;
    marks[4] = 36;

    for(int i=0;i<size;i++){
        numbers[i] =sc.nextInt();
    }
    for(int i=0;i<size;i++){

    System.out.println(numbers[i]);

}



ArrayDeque<String> animal = new ArrayDeque<>();

animal.add("Dog");

animal.addFirst("cat");

animal.addLast("cow");
System.out.println("ArrayDeque :" + animal);


ArrayDeque<String> animals = new ArrayDeque<>();
animals.offer("lion");

animals.offerFirst("tiger");

animals.offerLast("rabbit");

System.out.println("ArrayDeque : " + animals);

String firstElement = animals.getFirst();
System.out.println("first Element : "+ firstElement);


String lastElement = animals.getLast();
System.out.println("lastElement : "+ lastElement);





// package bank;

// // class Account{
//    public String name;
//     protected String email;
//     private  String possword;

//     public String getPossword(){
//         return this.possword;
//     }
//     public void  setPossword(String pass){
//         this.possword = pass;
//     }
// // }
// // public class  Bank {
// //     public static void main(String[] args) {
//         Account a1 = new Account();
//         a1.name = "sandeep";
//         a1.email = "sy8673484@gmail.com";
//         a1.setPossword ("abcd");
//         System.out.println(a1.getPossword());
// //     }
    
// // }





// // class second {
//     String name;
//     int age;
//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);
        
//     }
//     class shape{
//         String color;

//     }
//     class Triangle extends shape{

// //     }

// }
//     // public class oops{

    
//     // public static void main(String arg[]) {
//         second s1 = new second();
//         s1.name = "Sandeep Yadav";
//         s1.age = 21;

//         s1.printInfo();

//         Triangle t1 = new Triangle();
//         t1.color = "red";
        

    //    }
    // }
}
}

 