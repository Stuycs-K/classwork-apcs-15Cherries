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
}
