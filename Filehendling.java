import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;


public class Filehendling implements Serializable {
     private static final long serialVersionUID = 6163321482548364831L;
     private String str;
     private int number;
     public Filehendling( final String str, final int number, Filehendling filehendling) {
     filehendling.setStr(str);
     this.setNumber(number);
     }
     private void setNumber(int number2) {
     }
     private void setStr(String str2) {
     }
     private void readObject(ObjectInputStream stream) throws InvalidObjectException {
     throw new InvalidObjectException( "Serialization Proxy is expected" );
     }
     /**
      * @return
      */
     private Object writeReplace() {
     return new Object( );
     }
     // Setters and getters here
     }


// public class Filehendling {
//      private static Readable myfile;

//      public static void main(String[] args) throws IOException {

          //NEW FILE CREATING IN JAVA

          // File myfile = new File("Filehandling.text");

          // myfile.createNewFile();
          // System.out.println("unable to create file");


            // NEW FILE WRITING IN JAVA

          // FileWriter fileWriter = new FileWriter("Filehandling.text");
          // fileWriter.write("this is my first java file \nthanku for using webside");
          // fileWriter.close();

          // BEW FILE READING IN JAVA

//           Scanner sc = new Scanner(myfile);
//           while(sc.hasNextLine()){
//                String line = sc.nextLine();
//                System.out.println(line);

//           }
//           sc.close(); 
          

         

//      }
// }
