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

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size(); i++){
      if (original.get(i).equals("")){
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String> reversedArray = new ArrayList<String>();
    for (int i = original.size() - 1; i >= 0; i--){
      reversedArray.add(original.get(i));
    }
    return reversedArray;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
    ArrayList<String> mixedArray = new ArrayList<String>();
    ArrayList<String> shortestOne;
    ArrayList<String> longestOne;
    if (a.size() >= b.size()){
      shortestOne = b;
      longestOne = a;
    }
    else{
      shortestOne = a;
      longestOne = b;
    }
    for (int i = 0; i < shortestOne.size(); i++){
      mixedArray.add(shortestOne.get(i));
      mixedArray.add(longestOne.get(i));
    }
    for (int i = shortestOne.size(); i < longestOne.size(); i ++){
      mixedArray.add(longestOne.get(i));
    }

    return mixedArray;
  }
}
