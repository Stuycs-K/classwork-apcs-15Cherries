import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

  public static boolean isTriangle(String sides){
    String [] triSides = sides.split("\\s+");
    int sideA = Integer.parseInt(triSides[0]);
    int sideB = Integer.parseInt(triSides[1]);
    int sideC = Integer.parseInt(triSides[2]);
    if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
      return true;
    }
    return false;
  }

  public static int countTrianglesA(String fileName){
    int count = 0;
    try {
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){
          if (isTriangle (input.nextLine())){
            count++;
          }
        }
        input.close();
      } catch (FileNotFoundException ex) {
        System.out.println("File not found");
      }
    return count;
  }


}
