import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

  public static boolean isTriangle(String sides){
    String [] triSides = sides.split("\\s+");
    int sideA = Integer.parseInt(triSides[0]);
    int sideB = Integer.parseInt(triSides[1]);
    int sideC = Integer.parseInt(triSides[2]);
    return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
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

  public static int countRows(String fileName){
    int count = 0;
    try {
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){
          count++;
        }
        input.close();
      } catch (FileNotFoundException ex) {
        System.out.println("File not found");
      }
    return count;
  }

  public static int countTrianglesB(String fileName){
    int count = 0;

    try{
      File file = new File(fileName);
      Scanner input = new Scanner(file);

      int rows = countRows(fileName);
      int [][] fileVal = new int [rows][3];

      int i = 0;
      while (input.hasNextLine() && i < rows){
        String triSides = input.nextLine().split.("\\s+");
        for (int x = 0; x < 3; x++){
          values[i][x] = Interger.parseInt(triSides[x]);
        }
        i++
      }
      input.close();

      for (int x = 0; x < 3; x++){
        for (int i = 0; i < rows; i+=3){
          int sideA = fileVal[i][x];
          int sideB = fileVal[i+1][x];
          int sideC = fileVal[i+2][x];

          if (isTriangle(sideA, sideB, sideC)){
            count++
          }
        }
      }
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return count;
  }

}
