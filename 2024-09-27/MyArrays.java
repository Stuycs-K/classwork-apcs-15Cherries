
public class MyArrays{
  public static void main (String [] args){
    System.out.println("Hello");
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

}
