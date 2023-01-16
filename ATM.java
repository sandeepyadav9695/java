import java.util.Scanner;  
public class ATM {
     int id;
     String name;
     int rollno;
     String names;
     float salary;
     int lenth;
     int width;
     int fact = 1;
     int acco_no;
     String namese;
     float amount;
     void insert(int ac,String na, float amt)
     {
      acco_no = ac;
      namese = na;
      amount = amt;
     }
     void deposit(float amt){
          
          amount=amount+amt;
          System.out.println("deposit  "+amt);
     }
     void withdra(float amt){
          if(amount<amt){
               System.out.println("infuance balence");
          }
          else{
          amount=amount-amt;
          System.out.println( "withdra  "+amt);
     }
}
void checkBalance(){
     System.out.println("balance is " +amount);
}
void display(){
     System.out.println((acco_no+"  "+namese+"  "+amount));
}




     void fact(int n) {
     for(int i =1;i<=n;i++){
         fact=fact*i;
     }
     System.out.println("foctorial is "  +fact);
}



     void insert(int l,int w){
        lenth = l;
        width = w;
     }
     void culculateArea(){
          System.out.println(lenth*width);
     }




     void insertrecord(int r,String n,float f){
          rollno= r;
          names = n;
          salary = f;
     }
   void  displayinformation(){
     System.out.println(rollno+" "+names+" "+salary);
   }
}
class TestJavaprogram{
     public static void main(String[] args) {
          int n1=0,n2=1,n3,i,count=10;
          int a,b=0,flag=0;
          int c=3;
          int balance = 100000,withdra,deposit;
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the number yiu want to check");
          int number=sc.nextInt();
          number=Math.abs(number);
          int n = number;
          String str = String.valueOf(number);
          int digitarray[] = new int[str.length()];
          for(int j = digitarray.length-1;j>=0;j--){
               digitarray[j]=n%10;
               n=n/10;
               }
               boolean flags=true;
               for(int j = 0; j<digitarray.length;j++){
                    int counts = 0;
                    for(int k = 0; k<digitarray.length; k++){
                         if(j==digitarray[j])
                         counts++;
                    }
                    if(counts!=digitarray[j]){
                         flags=false;
                         break;
                    }
               }
               if(flags)
               System.out.println(number+" is an auto biographical number");
               else
               System.out.println(number+" is not autobiographical number");
               






          while(true){
               System.out.println("Atometor teller machine");
               System.out.println("Choise 1 for withdra");
               System.out.println("Choise 2 for deposit");
               System.out.println("Choise 3 for check balance");
               System.out.println("Choise 4 for exit");
               System.out.println("Choise the operation you want to perform");
          
          int choise = sc.nextInt();
          switch(choise){
               case 1:
               System.out.println("Enter money to withdra");
               withdra=sc.nextInt();
               if(balance>=withdra){
               balance=balance-withdra;
               System.out.println("Please collect your money");
               }
               else{
                    System.out.println("infficience balance");
               }
               System.out.println(" ");
               break;
               case 2:
               System.out.println("Enter to be deposit money");
               deposit=sc.nextInt();
               balance=balance+deposit;
               
               System.out.println("Your money deoisit successfuly");
               System.out.println("");
               break;
               case 3:
               System.out.println("Balance : "+balance);
               System.out.println("");
               break;
               case 4:
               System.exit(0);

              
          }





     }







          // ATM accountJavaprogram = new ATM();
          // accountJavaprogram.insert(89200,    "sandeep",     2000);
          // accountJavaprogram.display();
          // accountJavaprogram.checkBalance();
          // accountJavaprogram.deposit( 4500);
          // accountJavaprogram.checkBalance();
          // accountJavaprogram.withdra(3300);
          // accountJavaprogram.checkBalance();





     //  new ATM().fact(5);





     //     ATM rectengle1 = new ATM(),rectengle2 = new ATM(); ; 
       
     //     rectengle1.insert( 12 ,  2);
     //     rectengle2.insert(3  ,  15);
     //     rectengle1.culculateArea();
     //     rectengle2.culculateArea();




          
          // ATM jv1 = new ATM();
          // ATM jv2 = new ATM(); 
          // ATM jv3 = new ATM(); 
          // jv1.insertrecord(120, " sandeep ",20000);
          // jv2.insertrecord(100,  " sandy ",21000);
          // jv3.insertrecord(130, " radhe ", 21100);
          // jv1.displayinformation();
          // jv2.displayinformation();
          // jv3.displayinformation();




          // jv1.id =200;
          // jv1.name ="sandeep";
          // jv2.id = 199;
          // jv2.name = "sandy";
          // System.out.println(jv1.id+ " "  +jv1.name);
          // System.out.println(jv2.id+ " "  +jv2.name);
         



          // b=c/2;
          // if(c==0||c==1){
          //      System.out.println(c+"is prime number");
          //      }
          //      else{
          //           for(a=2;a<=b;a++){
          //                if(a%c==0){
          //                     System.out.println(a+"number is not prime");
          //                     flag=1;
          //                     break;
          //                }
          //           }
          //           if(flag==0){
          //                System.out.println(a+"is prime number");
          //           }
          //      }

          // System.out.println(n1+""+n2);
          // for(i=2; i<count; ++i){
          //      n3=n1+n2;
          //      System.out.println(""+n3);
               // n1=n2;
               // n2=n3;
          // }

     }
}




