import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Day2{

    public static String[] parse(String fileName){
      ArrayList<String> lines = new ArrayList<>();
      try{
        Scanner inf = new Scanner(new File(fileName));
        while (inf.hasNextLine()) {
          lines.add(inf.nextLine());
        }
      } catch (FileNotFoundException e){
        System.out.println("file not found");
        return null;
      }
      return lines.toArray(new String[0]);
    }

  public static String code (String [] data){
    int [][] keypad = new int [][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    String bCode = "";
    int row = 1;
    int column = 1;

    for (int i = 0; i < data.length; i++){
      for (int x = 0; x < data[i].length(); x++){
        char direction = data[i].charAt(x);

        if (direction == 'U' && row > 0){
          row --;
        }
        else if (direction == 'D' && row < 2){
          row ++;
        }
        else if (direction == 'R' && column < 2){
          column ++;
        }
        else if (direction == 'L' && column > 0){
          column --;
        }
      }
      bCode += keypad[row][column];
      //char direction = data.charAt(i);
    }
    return bCode;
  }
  public static void main (String[] args){
    String [] data = parse("Day2Input.txt");
    System.out.println(code(new String [] {"ULL", "RRDDD", "LURDL", "UUUUD"}));
    System.out.println(code(data));

  }
}
