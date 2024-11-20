import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Day4 {

  public static ArrayList parse(String fileName){
    ArrayList<String> data = new ArrayList<String>();
    try{
      Scanner inf = new Scanner(new File(fileName));
      while(inf.hasNextLine()){
        data.add(inf.nextLine());
      }
    } catch (Exception e){
      System.out.println("file not found");
    }
    return data;
  }

  public static void main (String [] args){
    System.out.println(parse("Day4Input.txt"));
  }
}
