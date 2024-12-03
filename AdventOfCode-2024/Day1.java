import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Arrays;


public class Day1{

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

  public static void sort(int [] data){
    for (int i = 0; i < data.length; i++){
      int current = data[i];
      int j = i - 1;
      while (j >= 0 && data[j] > current){
        data[j+1] = data[j];
        j--;
      }
      data[j+1] = current;
    }
  }
  public static int totalDistance( int [] a, int [] b){
    sort(a);
    sort(b);
    int totalDistance = 0;
    for (int i = 0; i < a.length; i++){
      totalDistance += Math.abs(a[i] - b[i]);
    }
    return totalDistance;
  }

  public static void main (String[] args){
    //int [] a = {3, 4, 2, 1, 3, 3};
    //int [] b = {4, 3, 5, 3, 9, 3};
    //System.out.println(totalDistance(a, b));

    ArrayList<String []> data = parse("Day1Input.txt");
    int length = data.size();
    int [] a = new int [length];
    int [] b = new int [length];
    for (int i = 0; i < length; i ++){
      a[i] = Integer.parseInt((data.get(i))[0]);
      b[i] = Integer.parseInt((data.get(i))[1]);
    }
    //System.out.println(Arrays.toString(a));
    //System.out.println(Arrays.toString(b));
    System.out.println(totalDistance(a, b));
  }
}
