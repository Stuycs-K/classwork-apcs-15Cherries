import java.io.File;
import java.util.Scanner;

public class Day1{
  public static String[] parse(String fileName){
    int count = 0;
    try{
      Scanner inf = new Scanner(new File(fileName));
      String line = inf.nextLine();
      System.out.print(line);
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
      String direction = data[i].substring(0);
      int block = Integer.valueOf(data[i].substring(1));
    }
    return 0;
  }
}
