
public class MyArrays{
  public static void main (String [] args){
    int [] anArray = new int [] {1, 2, 3, 4, 5};
    System.out.println("Expected [1, 2, 3, 4, 5] and returnCopy returns" + returnCopy(new int [] {1, 2, 3, 4, 5}));
  }

public static String aryToStrings (int [] nums){
  String newString = "[";
  for (int i = 0; i < nums.length; i++){
    newString = newString + nums[i];
    if (i != nums.length - 1){
      newString = newString + ",";
    }
  }
  return newString + "[";
}

public static int [] returnCopy (int[] ary){
  return ary;
}

}
