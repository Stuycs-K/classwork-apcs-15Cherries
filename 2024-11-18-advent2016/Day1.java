import java.io.File;
import java.util.Scanner;

public class Day1{
  public static String[] parse(String fileName){
    int count = 0;
    try{
      Scanner inf = new Scanner(new File(fileName));
      String line = inf.nextLine();
      //System.out.print(line);
      return line.split(", ");
    } catch (Exception e){
      System.out.println("file not found");
    }
    return null;
  }

  public static int totalBlocks(String[] data){
    int x = 0;
    int y = 0;
    int dx = 0, dy = 1; //facing north

    for (int i = 0; i < data.length; i++){
      String direction = data[i].substring(0,1);
      int block = Integer.parseInt(data[i].substring(1));

      if (direction.equals("L")){
        int storeVal = dx;
        dx = -dy;
        dy = storeVal; //90 degree counterclockwise rotation
      }
      else if (direction.equals("R")){
        int storeVal = dx;
        dx = dy;
        dy = -storeVal;//90 degree clockwise rotation
      }

      x += dx * block;
      y += dy * block; //for each coordinate move in the correct direction
    }
    return Math.abs(x) + Math.abs(y);
  }

  public static void main (String [] args){
    String [] data = parse("Day1Input.txt");
    //String [] try = new String [] {"R2", "L3"};
    //System.out.println(totalBlocks(new String [] {"R2", "L3"}));
    //System.out.println(totalBlocks(new String [] {"R2", "R2", "R2"}));
    //System.out.println(totalBlocks(new String [] {"R5", "L5", "R5", "R3"}));
    System.out.println(totalBlocks(data));



  }
}
