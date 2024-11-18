import java.util.ArrayList;

public class Driver{
  public static void main (String[] args){
    ArrayList<String> trial = ArrayListPractice.createRandomArray(5);
    System.out.println(trial);
    ArrayListPractice.replaceEmpty(trial);
    System.out.println(trial);
    System.out.println(ArrayListPractice.makeReversedList(trial));
  }
}
