import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Arrays;


public class Day2{

  public static ArrayList<String []> parse (String fileName){
    ArrayList<String []> lines = new ArrayList<String []>();
    try{
      Scanner inf = new Scanner(new File(fileName));
      while (inf.hasNextLine()){
        lines.add((inf.nextLine()).split("\\s+"));
      }
    } catch (FileNotFoundException e){
      System.out.println("file not found");
      return null;
    }
    return lines;
  }

  public static int safe(ArrayList<int []> data){
    int reports = data.size();
    String change = "";
    int safe = 0;
    for (int i = 0; i < data.size(); i ++){
      int totalLevels = data.get(i).length;
      boolean add = true;
      if (data.get(i)[0] < data.get(i)[1]){
        change = "increasing";
      }
      if (data.get(i)[0] > data.get(i)[1]){
        change = "decreasing";
      }
      if (change.equals("increasing")){
        for (int x = 0; x < totalLevels - 1; x++){
          if (data.get(i)[x+1] - data.get(i)[x] > 3 || data.get(i)[x+1] - data.get(i)[x] < 1){
            add =  false;
          }
        }
      }
      if (change.equals("decreasing")){
        for (int x = 0; x < totalLevels - 1; x++){
          if (data.get(i)[x] - data.get(i)[x+1] > 3 || data.get(i)[x] - data.get(i)[x+1] < 1){
            add =  false;
          }
        }
      }
      if (add){
        safe++;
      }
    }
    return safe;
  }

  public static void main (String [] args){
    //int [][] data = new int [][] {{7, 6, 4, 2, 1}, {1, 2, 7, 8, 9}, {9, 7, 6, 2, 1}, {1, 3, 2, 4, 5}, {8, 6, 4, 4, 1}, {1, 3, 6, 7, 9}};
    //System.out.println(safe(data));

    ArrayList<String []> data = parse("Day2Input.txt");
    ArrayList<int []> a = new ArrayList<int []>();
    for (int i = 0; i < data.size(); i ++){
      a.add(new int [data.get(i).length]);
      for (int x = 0; x < data.get(i).length; x++){
        a.get(i)[x] = Integer.parseInt(data.get(i)[x]);
      }
    }

    System.out.println(safe(a));
  }
}
