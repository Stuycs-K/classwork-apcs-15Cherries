import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

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

  public static int countTrianglesA(String fileName){
    int count = 0;
    File file = new File("fileName");
    Scanner input = new Scanner(file);
    int [] sideA;
    while(input.hasNextLine()){
      System.out.println(input.nextLine());
      sideA = (input.NextLine()).split();
      //System.out.println(sideA);
    }
    return sideA;
  }


}
