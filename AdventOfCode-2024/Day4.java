import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4{

  public static char [][] parse(String fileName){
    ArrayList<String> dataa = new ArrayList<String>();
    char [] [] data = new char [0][0];
    try{
      Scanner input = new Scanner (new File(fileName));
      while (input.hasNextLine()){
        dataa.add(input.nextLine());
      }

      int columns = dataa.get(0).length();
      int rows = dataa.size();
      data = new char [rows][columns];

      for (int i = 0; i < rows; i++){
        for (int x = 0; x < columns; x++){
          data[i][x] = dataa.get(i).charAt(x);
        }
      }
    } catch (FileNotFoundException e){
      System.out.println("file not found");
      return null;
    }
    return data;
  }

  public static int diagonal(char [][] data){
    int count = 0;
    for (int i = 0; i < data.length - 3; i++){
      for (int x = 0; x < data[0].length - 3; x++){
        if (data[i][x] == 'X' && data[i+1][x+1] == 'M' && data[i+2][x+2] == 'A' && data[i+3][x+3] == 'S'){
          count++;
        }
      }
    }
    for (int i = 0; i < data.length - 3; i++){
      for (int x = data[0].length-1; x >=3; x--){
        if (data[i][x] == 'X' && data[i+1][x-1] == 'M' && data[i+2][x-2] == 'A' && data[i+3][x-3] == 'S'){
          count++;
        }
      }
    }
    for (int i = data.length-1; i >= 3; i--){
      for (int x = data[0].length-1; x >=3; x--){
        if (data[i][x] == 'X' && data[i-1][x-1] == 'M' && data[i-2][x-2] == 'A' && data[i-3][x-3] == 'S'){
          count++;
        }
      }
    }
    for (int i = data.length-1; i >= 3; i--){
      for (int x = 0; x < data[0].length - 3; x++){
        if (data[i][x] == 'X' && data[i-1][x+1] == 'M' && data[i-2][x+2] == 'A' && data[i-3][x+3] == 'S'){
          count++;
        }
      }
    }
    return count;
  }

  public static int vertical(char [][] data){
    int count = 0;
    for (int i = 0; i < data.length - 3; i++){
      for (int x = 0; x < data[0].length; x++){
        if (data[i][x] == 'X' && data[i+1][x] == 'M' && data[i+2][x] == 'A' && data[i+3][x] == 'S'){
          count++;
        }
      }
    }
    for (int i = data.length - 1; i >= 3; i--){
      for (int x = 0; x < data[0].length; x++){
        /*System.out.print(data[i][x]);
        System.out.print(data[i-1][x]);
        System.out.print(data[i-2][x]);
        System.out.println(data[i-3][x]);*/
        if (data[i][x] == 'X' && data[i-1][x] == 'M' && data[i-2][x] == 'A' && data[i-3][x] == 'S'){
          count++;
        }
      }
    }
    return count;
  }

  public static int horizontal(char [] [] data){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      for (int x = 0; x < data[0].length-3; x++){
        if (data[i][x] == 'X' && data[i][x+1] == 'M' && data[i][x+2] == 'A' && data[i][x+3] == 'S'){
          count++;
        }
      }
    }
    for (int i = 0; i < data.length; i++){
      for (int x = data[0].length - 1; x >= 3; x--){
        if (data[i][x] == 'X' && data[i][x-1] == 'M' && data[i][x-2] == 'A' && data[i][x-3] == 'S'){
          count++;
        }
      }
    }
    return count;
  }

  public static int sum(char[][]data){
    return horizontal(data) + vertical(data) + diagonal(data);
  }

  public static void main (String[] args){
    char [][] data = parse("Day4Input.txt");
    //System.out.println(Arrays.deepToString(data));
    System.out.println(sum(data));
  }
}
