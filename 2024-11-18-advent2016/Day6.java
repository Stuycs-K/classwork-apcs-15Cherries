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

  public static String message(ArrayList<String> data){
    String message = "";
    for (int i = 0; i < data.size(); i++){
      int mostCommon = 1;
      int index = 0;
      char letter = data.get(0).charAt(i); //first letter of first row
      for (int x = 1; x < data.get(x).length(); x++){
        int appears = 0;
        if (data.get(x).charAt(i) == letter){
          appears++;                   //count how many times that letter shows up in that position
        }
        if (appears > mostCommon){
          mostCommon = appears;        //if that letter appears the most
          index = x;                   //the char at its index is the most common letter
        }
      }
      message += data.get(index).charAt(i);
    }
    return message;
  }

  public static void main (String [] args){
    ArrayList<String> data = parse("Day6Input.txt");
    System.out.println(message(data));
  }
}
