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
    int facing = 90;  //0 = North; 90 = East; 180 = South; 270 = West
    for (int i = 0; i < data.length; i++){
      String direction = data[i].substring(0,1);
      int block = Integer.parseInt(data[i].substring(1));
      if (direction.equals("R")){
        facing = (facing + 90) % 360;
      }
      else if (direction.equals("L")){
        facing = (facing + 270) % 360;
      }
      if (facing == 0){
        y += block;
        break;
      }
      if (facing == 90){
        x += block;
        break;
      }
      if (facing == 180){
        y -= block;
        break;
      }
      if (facing == 270){
        x -= block;
        break;
      }
    }
    return Math.abs(x) + Math.abs(y);
  }

  public static void main (String [] args){
    String [] data = parse("Day1Input.txt");
    //String [] try = new String [] {"R2", "L3"};
    System.out.println(totalBlocks(new String [] {"R2", "L3"}));
    System.out.println(totalBlocks(new String [] {"R2", "R2", "R2"}));

  }
}
