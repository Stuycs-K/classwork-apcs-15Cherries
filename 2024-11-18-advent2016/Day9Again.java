import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Day9Again{
  public static String parse(String fileName){
    String data = "";
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()){

        String line = input.nextLine().trim();//check for unwanted white spaces
        if (line.isEmpty()) {
              continue;
        } //check for empty lines

        data += line;
      }
    } catch (Exception e){
      System.out.println("file not found");
    }
    return data;
  }

  public static int decompressedLength(String data){
    int i = 0;
    int length = 0;

    while (i < data.length()){
      char here = data.charAt(i);

      if (here == '('){
        int closeParen = data.indexOf(')', i);
        String marker = data.substring(i + 1, closeParen);
        String[] parts = marker.split("x");

        int numChars = Integer.parseInt(parts[0]); // N
        int repeat = Integer.parseInt(parts[1]);   // M

        // Add the length of the expanded marker
        length += numChars * repeat;

        // Move the pointer past the marker and the affected characters
        i = closeParen + 1 + numChars;
      }
      else if (!Character.isWhitespace(here)){
        i ++;
        length++;
      }
      else{
        i++;
      }
    }
    return length;
  }

  public static void main (String[] args){
    System.out.println(decompressedLength("(3x3)XYZ"));
    System.out.println(decompressedLength("A(1x5)BC"));
    String data = parse("Day9Input.txt");
    System.out.println(decompressedLength(data));
  }
}
