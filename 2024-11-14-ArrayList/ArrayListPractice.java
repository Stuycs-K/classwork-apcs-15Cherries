public class ArrayListPractice{
  public static ArrayList<String> createRandomArray(int size){
    ArrayList<String> random = new ArrayList<String>();
    for (int i = 0; i < size; i++){
      random.add("" + Math.random());
      if (random.get(i).equals("0")){
        random.set(i, "");
      }
    }
    return random;
  }
}
