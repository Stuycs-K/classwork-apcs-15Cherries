import java.io.File;
import java.util.Scanner;

public class Day1{
  public static int totalBlocks(String fileName){
    int count = 0;
    try{
      File file = new File (fileName);
      Scanner input = new Scanner (file);
      System.out.print(input);
    } catch (Exception e){
      System.out.println("file not found");
    }
    return 0;
  }
}
