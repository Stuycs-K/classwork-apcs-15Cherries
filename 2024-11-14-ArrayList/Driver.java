import java.util.ArrayList;

public class Driver{
  public static void main (String[] args){
    ArrayList<String> trial = ArrayListPractice.createRandomArray(5);
    System.out.println(trial);
    ArrayListPractice.replaceEmpty(trial);
    System.out.println(trial);
    System.out.println(ArrayListPractice.makeReversedList(trial));
    ArrayList<String> trial2 = ArrayListPractice.createRandomArray(7);
    ArrayListPractice.replaceEmpty(trial2);
    System.out.println(trial2);
    System.out.println(ArrayListPractice.mixLists(trial, trial2));

    ArrayList<String> tenRandom = ArrayListPractice.createRandomArray(10);
    System.out.println("array of size 10: " + tenRandom);
    ArrayList<String> thirteenRandom = ArrayListPractice.createRandomArray(13);
    System.out.println("array of size 13: " + thirteenRandom);
    ArrayList<String> sevenRandom = ArrayListPractice.createRandomArray(7);
    System.out.println("array of size 7: " + sevenRandom);
    ArrayList<String> noRandom = ArrayListPractice.createRandomArray(0);
    System.out.println("array of size 0: " + noRandom);
    ArrayList<String> huge = ArrayListPractice.createRandomArray(200000);
    System.out.println("first 10 of array of size 200,000: " + huge.subList(0,10));

    ArrayListPractice.replaceEmpty(tenRandom);
    System.out.println("array of size 10 edited: " + tenRandom);
    ArrayListPractice.replaceEmpty(thirteenRandom);
    System.out.println("array of size 13 edited: " + thirteenRandom);
    ArrayListPractice.replaceEmpty(sevenRandom);
    System.out.println("array of size 7 edited: " + sevenRandom);
    ArrayListPractice.replaceEmpty(noRandom);
    System.out.println("array of size 0 edited: " + noRandom);
    ArrayListPractice.replaceEmpty(huge);
    System.out.println("first 10 of array of size 200,000 edited: " + huge.subList(0,10));

    System.out.println("array of size 10 reversed: " + ArrayListPractice.makeReversedList(tenRandom));
    System.out.println("array of size 13 reversed: " + ArrayListPractice.makeReversedList(thirteenRandom));
    System.out.println("array of size 7 reversed: " + ArrayListPractice.makeReversedList(sevenRandom));
    System.out.println("array of size 0 reversed: " + ArrayListPractice.makeReversedList(noRandom));
    System.out.println("first 10 of array of size 200,000 reversed: " + ArrayListPractice.makeReversedList(huge));


  }
}
