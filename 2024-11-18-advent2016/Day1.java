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
    for (int i = 0; i < data.length; i++){
      String direction = data[i].substring(0,1);
      int block = Integer.valueOf(data[i].substring(1));
      int facing = 90;
      if (direction.equals("R") && facing == 90){
        x += block;
        facing = 0;
      }
      if (direction.equals("R") && facing == 0){
        y -= block;
        facing = 90;
      }
      if (direction.equals("L") && facing == 90){
        x -= block;
        facing = 0;
      }
      if (direction.equals("L") && facing == 0){
        y += block;
        facing = 90;
      }
    }
    return 0;
  }

  public static void main (String [] args){
    String [] data = parse("Day1Input.txt");
    System.out.println(totalBlocks(data));
  }
}
