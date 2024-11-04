import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver{
  /*File file = new File("Driver.java");
  Scanner input = new Scanner(file);*/

  public static void main (String[] args){

    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        System.out.println(input.nextLine());
      }
        //do something with the next line of the file
      //CODE THAT SCANS THE FILE.
      input.close();//releases the file from your program

      } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
      }

      System.out.println(TriangleTester.countTrianglesA(inputTri.txt));


    }
}
