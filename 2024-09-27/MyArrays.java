
public class MyArrays{
  public static void main (String [] args){
    int [] anArray = new int [] {1, 2, 3, 4, 5};
    System.out.println("[1, 2, 3, 4, 5] has an address of "+ anArray + " and the copy has an address of " + returnCopy(new int [] {1, 2, 3, 4, 5}));
    System.out.println("For [1, 2, 3, 4, 5], returnCopy copies " + aryToStrings(returnCopy(new int [] {1, 2, 3, 4, 5})));
    System.out.println("Are the elements the same? " + sameElements(anArray, returnCopy(new int [] {1, 2, 3, 4, 5})));
    anArray = new int [] {47, 46, 45, 44, 42, 41};
    System.out.println("[47, 46, 45, 44, 42, 41] has an address of "+ anArray + " and the copy has an address of " + returnCopy(new int [] {47, 46, 45, 44, 42, 41}));
    System.out.println("For [47, 46, 45, 44, 42, 41], returnCopy copies " + aryToStrings(returnCopy(new int [] {47, 46, 45, 44, 42, 41})));
    System.out.println("Are the elements the same? " + sameElements(anArray, returnCopy(new int [] {47, 46, 45, 44, 42, 41})));
    anArray = new int [] {0};
    System.out.println("[0] has an address of "+ anArray + " and the copy has an address of " + returnCopy(new int [] {0}));
    System.out.println("For [0], returnCopy copies " + aryToStrings(returnCopy(new int [] {0})));
    System.out.println("Are the elements the same? " + sameElements(anArray, returnCopy(new int [] {0})));
  }

  public static String aryToStrings (int [] nums){
    String newString = "[";
    for (int i = 0; i < nums.length; i++){
      newString = newString + nums[i];
      if (i != nums.length - 1){
        newString = newString + ", ";
      }
    }
    return newString + "]";
  }

  //Write a function that returns a new array with the same values as the parameter ary.
  public static int [] returnCopy (int[] ary){
    int [] newArray = new int [ary.length];
    for (int i = 0; i < ary.length; i++){
      newArray[i] = ary[i];
    }
    return newArray;
  }

//tests if the arrays match
  public static boolean sameElements (int [] array1, int [] array2){
    if (array1.length != array2.length){
      return false;
    }
    for (int i = 0; i < array1.length; i ++){
      if (array1[i] != array2[i]){
        return false;
      }
    }
    return true;
  }

  //Write a function that returns a new array, that contains all of the values of ary1
  //followed by all of the values of ary2. The order of the values should remain the same.
  public static int[] concatArray(int[]ary1,int[]ary2){
    int [] bigArray = new int [ary1.length + ary2.length];
    int index = 0;
    for (int i = 0; i < ary1.length; i++){
      bigArray[index] = ary1[i];
      index++;
    }
    for (int i = 0; i < ary2.length; i++){
      bigArray[index] = ary2[i];
      index++;
    }
    return bigArray;
  }

}
