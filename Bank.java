

// package bank;

// class Account{
//    public String name;
//     protected String email;
//     private  String possword;

//     public String getPossword(){
//         return this.possword;
//     }
//     public void  setPossword(String pass){
//         this.possword = pass;
//     }
//     public void setName(String string) {
//     }
//     public char[] getname() {
//         return null;
//     }
// }
// public class Bank {
//      public static void main(String[] args) {
//           Account a1 = new Account();
//           a1.name = "sandeep";
//           a1.email = "sy8673484@gmail.com";
//           a1.setPossword ("abcd");
       
//           System.out.println(a1.getPossword());
       
//       }
     
// }




public class Bank{
    public enum Day { Sun, Mon, Tue, Wed, Thu, Fri, Sat }
    public enum Manth { Jan, Feb, Mar, Apl, May, Jun, July, August, Sep, Oct, Nov, Dec}
    public static void main(String[] args) {
        System.out.println("Hellow Sandeep Yadav");
        String city = "Delhi";
        int num = 3;
        int sum = 0;
        String[] names={"c","c++","java","python","js","html","css"};
        int a = 0;
        int b = 0;
        int age = 28;
        int number = 221;
        int year = 2020;
        int marks = 85;
        int numb = -20;
        int ages = 20;
        int weight = 50;
        int numbe = 20;
        int manth = 9;
        String manthString ="";
        char ch = 'e';
        int nu = 10;
      String stringlevel = "expert";
      int level = 0;
      char branch = 'c';
      int colledgeyear = 4;
      int agese = 19;
      int arr[] = {22,22,23,24,25,26,27,28,29,30};
      int i=1;
      int t=1;
      int q=1;
      int r=1;
      int mm=1;
      int nn= 1;
      do{
        if(nn==5){
          nn++;
          continue;
        }
        System.out.println(nn);
        nn++;
      }
      while(nn<=10);






      while(mm<=5){
        if(mm==3){
          mm++;
          continue;
        }
        System.out.println(mm);
        mm++;
      }





      cc:
      for(int jj=1; jj<=3; jj++){
        dd:
        for(int kk=1;kk<=3;kk++){
          if(jj==2&&kk==2){
            continue cc;
          }
          System.out.println(jj+""+kk);
        }
      }




      for(int ii=1; ii<=10; ii++){
        if(ii==5){
          ii++;
          continue;
        }
        System.out.println(ii);
      }




      do{
        if(r==5){
          r++;
          break;
        }
        System.out.println(r);
        r++;
      }while(r<=10);






      while(q<=10){
        if(q==5)
        {
          q++;
          break;
        }
        System.out.println(q);
        q++;
      }






      aa:
      for(int o=1; o<=3; o++){
        bb:
        for(int p=1; p<=3; p++){
          if(o==2&&p==2){
            break bb;
          }
          System.out.println(o+""+p);
        }
       
      }




      for(int k=1; k<=10;k++){
        if(k==5){
          break;
        }
        System.out.println(k);
      }




      // do{
      //   System.out.println("sandy");
      // }while(true);





      do{
        System.out.println(t);
        t++;
      }
        while(t<=10);
      




      // while(true){
      //   System.out.println("sandeep");
      // }





      while(i<=10){
        System.out.println(i);
        i++;
      }



      // for(;;){
      //   System.out.println("infinitive loop");
      // }




      aa:
      for(int u=1; u<=3;u++){
        bb:
        for(int v=1; v<=3; v++){
          if(u==2&&v==2){
            break bb;
          }
          System.out.println(u+""+v);
        }
      }









      for(int w:arr){
        System.out.println(w);
      }




     for(int x=1; x<=5; x++){
        for(int y=5; y>=i; y--)
        {
           System.out.print("* ");
        }
        System.out.println( );
      }




      switch(agese){
        case 16:
        System.out.println("You are not eligible for Vote.");
        break;
        case 18:
        System.out.println("You are eligible for Vote.");
        break;
        case 65:
        System.out.println("You are senior citizen.");
        break;
        default:
        System.out.println("Please give the under valid age.");
      }








      
      System.out.println("Print manthly name");
      Manth[] manthNow =Manth.values();
      for(Manth Now:manthNow){
        switch(Now){
            case Jan:
            System.out.println("january");
            break;
            case Feb:
            System.out.println("febuary");
            break;
            case Mar:
            System.out.println("march");
            break;
            case Apl:
            System.out.println("april");
            break;
            case May:
            System.out.println("may");
            break;
            case Jun:
            System.out.println("jun");
            break;
            case July:
            System.out.println("july");
            break;
            case August:
            System.out.println("august");
            break;
            case Sep:
            System.out.println("september");
            break;
            case Oct:
            System.out.println("october");
            break;
            case Nov:
            System.out.println("november");
            break;
            case Dec:
            System.out.println("december");
            break;

        }
      }
      




      Day[] DayNow = Day.values();
System.out.println("Print weekly day");
      for(Day Now:DayNow){
        switch(Now){
            case Sun:
            System.out.println("sunday");
            break;
            case Mon:
            System.out.println("monday");
            break; 
            case Tue:
            System.out.println("tuesdat");
            break;
            case Wed:
            System.out.println("wednesday");
            break;
            case Thu:
            System.out.println("thursday");
            break;
            case Fri:
            System.out.println("friday");
            break;
            case Sat:
            System.out.println("saturday");
            break;
            }
      }



      
      switch(colledgeyear){
        case 1:
        System.out.println("english,match,computer");
        case 2:
        switch(branch){
            case 'c':
            System.out.println("pcpackege,data structure,operating system");
            break;
            case 'e':
            System.out.println("micro proccesing,logic switching theory");
            break;
            case 'm':
            System.out.println("manufacturing,drawing");
            break;
        }
        case 3:
        switch(branch){
            case 'c':
            System.out.println("data base management sysout,communication managment");
            break;
            case 'e':
            System.out.println("foundamental,mocrodegining");
            break;
            case 'm':
            System.out.println("internal cumbunation ,micro desining");
            break;

        }
        case 4:
        switch(branch){
            case 'c':
            System.out.println("data communication and networking,multimedia");
            break;
            case 'e':
            System.out.println("embeded system, imag proccesing");
            break;
            case 'm':
            System.out.println("production tectnology,terminal engining");
            break;
        }
        break;
      }






      switch(stringlevel){
        case"Begnner":level=1;
        break;
        case"internediate":level=2;
        break;
        case"expert":level=3;
        break;
        default:level=0;
        break;
          }
          System.out.println("your level is : " +level);






        switch(nu){
            case 10:
            System.out.println("number is 10");
            case 20:
            System.out.println("number is 20");
            case 30:
            System.out.println("number is 30");
            case 40:
            System.out.println("number is 40");
            case 50:
            System.out.println("number is 50");
            default:
            System.out.println("not a 10,20,30,40 and 50");
        }







        switch(ch){
            case 'a':
            System.out.println("vavel");
            break;
            case 'e':
            System.out.println("vavel");
            break;
            case 'i':
            System.out.println("vavel");
            break;
            case 'o':
            System.out.println("vavel");
            break;
            case 'u':
            System.out.println("vavel");
            break;
            default:
            {
                System.out.println(("consonant number"));
            }
        }







        switch(manth){
            case 1:
            System.out.println("january");
            break;
            case 2:
            System.out.println("febuary");
            break;
            case 3:
            System.out.println("march");
            break;
            case 4:
            System.out.println("april");
            break;
            case 5:
            System.out.println("may");
            break;
            case 6:
            System.out.println("jun");
            break;
            case 7:
            System.out.println("july");
            break;
            case 8:
            System.out.println("august");
            break;
            case 9:
            System.out.println("september");
            break;
            case 10:
            System.out.println("october");
            break;
            case 11:
            System.out.println("november");
            break;
            case 12:
            System.out.println("december");
            break;
            default:
            System.out.println("invalid choese");

        }







         switch(numbe){
            case 10:
            System.out.println("number is 10");
            break;
            case 20:
            System.out.println("number is 20");
            break;
            case 30:
            System.out.println("number is 30");
            break;
            case 40:
            System.out.println("number is 40");
            break;
            default:
            System.out.println("not in 10,20,30 and 40"); 
         }





        if(ages>=18){
            if(weight>70){
                System.out.println("you are eligible for donate bool");
            }
        
        else{
            System.out.println("you are not eligible for donate blood ");
        }
    }
    else{
        System.out.println("you must be greather than 18");
    }



        if(numb>0){
            System.out.println("number is positive");
        }
        else if(numb<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is 0");
        }



        if((marks>=50)&&(marks<60)){
            System.out.println("fail");
        }
        else if((marks>=60)&&(marks<70)){
            System.out.println("C grade");
        }
        else if((marks>=70)&&(marks<80)){
            System.out.println("B grade");
        }
        else if((marks>=80)&&(marks<90)){
            System.out.println("A grade");
        }
        else if((marks>=90)&&(marks>100)){
            System.out.println("A+ grade");
        }
        else{
            System.out.println("invalid marks");
        }




        String output = (number%2==0)?"number even":"nuber odd";
        System.out.println(output);





        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.println("print leap year");
        }else{
            System.out.println("common year");
        }






        if(number%2==0){
            System.out.println("print even number");
        }
        else{
            System.out.println("print odd number");
        }





        if(age>18){
            System.out.println("age is greater than 18");
        }

        for(int f=0;f<=2;f++){

            for(int g=0;g<=10;g++){
               if(g==4){
                continue; 
            }
                    System.out.println(g);
               
               }
            }
        






    a:
    for(int l=0;l<=10;l++){
        b:
        for(int m=0;m<=15;m++){
            c:
            for(int n=0;n<=20;n++){
                
                    System.out.println(n);
                    if(n==5){
                        break a;
                    }
                    
                }
            }
        }
    



         
        for(int k=0;k<=10;k++){
            System.out.println(k);
            if(k==6){
                break;
            }
        }



        System.out.println("print the number : ");
        do{
            System.out.println(b);
            b=b+2;
        }
        while(b<=20);
           


        System.out.println("print the even number");
        while(a<=20){
            System.out.println(a);
            a=a+2;
        }







        System.out.println("print to the content name");
        for(String name:names){
                 System.out.println(name);
        }






        for(int z=1;z<10;z++){
            sum=sum+z;
        }
        
        {
            System.out.println("the sum of 10 netural number :"+sum);
        }




        switch(num){
            case 0:
            System.out.println("number is 0");
            break;
            case 1:
            System.out.println("number is 1");
            break;
            case 2:
            System.out.println("number is 2");
            break;
            case 3:
            System.out.println("number is 3");
        
        default:
        System.out.println(num);
    

    }







        if(city=="Junpur"){
            System.out.println("city is Jaunpur");
        }
        else if(city=="Bhopal"){
            System.out.println("city is Bhopal");
        }
        else if(city=="Mumbai"){
            System.out.println("city is Mumbai");
        }
        else if(city=="Lucknown"){
            System.out.println("city is Lucknown");
        }
        else if(city=="Delhi"){
            System.out.println("city is Delhi");
        }
        else{
            System.out.println(city);
        }
    }
}
