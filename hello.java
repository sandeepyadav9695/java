import java.util.Date;

class hello{
    // String name;
    // int age;
    // public void printInfo() {
    //     System.out.println(this.name);
    //     System.out.println(this.age);

    // }



    public static void main(String[] args) {
        
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.before(d));
        System.out.println(d.after(d));
        System.out.println(d.getTimezoneOffset());
        // f1.name = "RSandeep Yadav";
        // f1.age = 21;
        
        // f1.printInfo();
    }
}



    


