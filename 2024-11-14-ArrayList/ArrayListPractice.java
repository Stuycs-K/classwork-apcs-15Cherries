import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> randomArray = new ArrayList<String>();

    for (int i = 0; i < size; i++){
      int random = (int) (Math.random() * 10);
      if (random == 0){
        randomArray.add("");
      }
      else{
        randomArray.add("" + random);
      }
    }
    return randomArray;
  }
}
