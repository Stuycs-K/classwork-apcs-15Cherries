import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{

  public static boolean isTriangle(int sideA, int sideB, int sideC){
    return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
  }

  public static int countTrianglesA(String fileName){
    int count = 0;
    try {
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){
          String [] triSides = (input.nextLine()).split("\\s+");
          int sideA = Integer.parseInt(triSides[0]);
          int sideB = Integer.parseInt(triSides[1]);
          int sideC = Integer.parseInt(triSides[2]);
          if (isTriangle(sideA, sideB, sideC)){
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
          input.nextLine();
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
        String [] triSides = (input.nextLine()).split("\\s+");
        for (int x = 0; x < 3; x++){
          fileVal[i][x] = Integer.parseInt(triSides[x]);
        }
        i++;
      }
      input.close();

      for (int x = 0; x < 3; x++){
        for (int io = 0; io < rows; io+=3){
          int sideA = fileVal[io][x];
          int sideB = fileVal[io+1][x];
          int sideC = fileVal[io+2][x];

          if (isTriangle(sideA, sideB, sideC)){
            count++;
          }
        }
      }
    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
    }
    return count;
  }

}
