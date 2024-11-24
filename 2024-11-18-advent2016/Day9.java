import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Day9{
  public static String [] parse(String fileName){
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);

      while(input.hasNextLine()){

        String line = input.nextLine().trim();//check for unwanted white spaces
        if (line.isEmpty()) {
              continue;
        } //check for empty lines

        String [] data = (line.split("\\s+"));
      }
    } catch (Exception e){
      System.out.println("file not found");
    }
    return null;
  }

  public static int decompressedLength(String data){
    int index = 0;
    int length = 0;

    while (index < data.length()){
      char here = data.charAt(index);

      if (here == '('){
        int markerEnd = index + 4;
        String marker = data.substring(index + 1, markerEnd);
        String [] markerComponents = marker.split("x");
        int timesCounted = Integer.parseInt(markerComponents[0]);
        int repeatedLength = Integer.parseInt(markerComponents[1]);

        index += 5;

        String sequenceRepeated = data.substring(index, index + repeatedLength);
        for (int i = 0; i < timesCounted; i++){
          length += sequenceRepeated.length();
        }

        index += repeatedLength;
      }
      else{
        index ++;
        length++;
      }
    }
    return length;
  }
}
