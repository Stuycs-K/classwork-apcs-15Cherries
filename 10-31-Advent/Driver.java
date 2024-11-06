import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver{
  /*File file = new File("Driver.java");
  Scanner input = new Scanner(file);*/

  public static void main (String[] args){

    System.out.println(TriangleTester.countTrianglesA("inputTri.txt"));
    System.out.println(TriangleTester.countTrianglesB("inputTri.txt"));

    }
}
