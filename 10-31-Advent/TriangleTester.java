import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

  public static boolean isTriangle(String sides){
    String [] triSides = sides.split(" ");
    int sideA = Integer.parseInt(triSides[0]);
    int sideB = Integer.parseInt(triSides[1]);
    int sideC = Integer.parseInt(triSides[2]);
    if (sideA + sideB < sideC && sideA + sideC < sideB && sideB + sideC < sideA){
      return true;
    }
    return false;
  }

  /*public static int countTrianglesA(String fileName){
    try {
        File file = new File("fileName");//1
        Scanner input = new Scanner(file);
        //CODE THAT SCANS THE FILE.
        input.close();//releases the file from your program

      } catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
      }
    int count = 0;
    File file = new File(fileName);
    Scanner input = new Scanner(file);
    int [] sideA;
    while(input.hasNextLine()){
      System.out.println(input.nextLine());
      sideA = (input.nextLine()).split(" ");
      //System.out.println(sideA);
    }
    return count;
  }*/


}
