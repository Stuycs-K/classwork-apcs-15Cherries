import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Day3{
  public static boolean isTriangle(int sideA, int sideB, int sideC){
    return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
  }

  public static int countTrianglesA(String fileName){
    int count = 0;
    try {
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        while(input.hasNextLine()){

          String line = input.nextLine().trim();//check for unwanted white spaces
          if (line.isEmpty()) {
                continue;
          } //check for empty lines


          String [] triSides = (line.split("\\s+"));
          if (triSides.length != 3){
            System.out.println ("invalid line: " + line);
            continue;
          }

          try{
            int sideA = Integer.parseInt(triSides[0]);
            int sideB = Integer.parseInt(triSides[1]);
            int sideC = Integer.parseInt(triSides[2]);
            if (isTriangle(sideA, sideB, sideC)){
              count++;
            }
          } catch (NumberFormatException e ){
            System.out.println("Invalid number in line: " + line);
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
          String line = input.nextLine().trim();//check for unwanted white spaces;
          if (!line.isEmpty()){
            String [] triSides = line.split("//s+");
            if (triSides.length == 3){ // if the line actually has 3 sides
              count++
            }
          }
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

  public static void main (String[] args){
    System.out.println(countTrianglesA("Day3Input.txt"));
    System.out.println(countTrianglesB("Day3Input.txt"));

  }
}
