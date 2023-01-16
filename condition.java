import java.util.*;

// import javax.swing.DefaultBoundedRangeModel;
public class condition {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int button = sc.nextInt();
          

          // int n = 1;
          // if(age>18){
          //   System.out.println("adult");
          // }
          // else{
          //   System.out.println("not adult");
          // }
          switch(button){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Twesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thirsday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Satrday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default :
            System.out.println( "DefaultBoundedRangeModel");
          }

        }
}
