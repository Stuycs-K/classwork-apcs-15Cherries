import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Day6{
  public static ArrayList<String> parse(String fileName){
    ArrayList<String> data = new ArrayList<String>();
    try{
      Scanner file = new Scanner(new File(fileName));
      while (file.hasNextLine()){
        data.add(file.nextLine());
      }
    } catch (Exception e){
      System.out.println("file not found");
    }
    return data;
  }
}
