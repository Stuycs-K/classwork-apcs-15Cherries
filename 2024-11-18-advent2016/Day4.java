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

  public static boolean isReal(String input){
    String letters = input.substring(0,input.lastIndexOf("-"));
    String [] array = letters.split("-");
    String checksum = "[]";
    for (int i = 0; i < array.length; i++){
      int size = array[i].size();
    }
    return false;
  }

  public static void main (String [] args){
    System.out.println(isReal("nzydfxpc-rclop-qwzhpc-qtylyntyr-769[oshgk]").toString());
  }
}
