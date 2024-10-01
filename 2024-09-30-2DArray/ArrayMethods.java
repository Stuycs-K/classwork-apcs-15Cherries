public class ArrayMethods{

  //1. Write both your names + emails at the top of the document as a comment.
  //Nowar Nizum nnizum60@stuy.edu
  //Raphael Ramot rramot60@stuy.edu

  public static void main (String [] args){
    System.out.println(arrToString(new int [] {2, 3, 4, 9}));
    System.out.println(arrToString(new int [] [] { {2, 3, 4}, {5, 6, 7}, {2, 4, 9} }));
    System.out.println(arr2DSum(new int [] [] { {2, 3, 4}, {5, 6, 7}, {2, 4, 9} }));
    System.out.println(arrToString(swapRC(new int [] [] {{1,2,3},{4,5,6}})));

  }

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] nums) {
    String str = "[";
    for (int i = 0; i < nums.length; i++) {
      str += nums[i];
      if (i < nums.length-1)
        str += ", ";
    }
    str += "]";
    return str;
  }


//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  String newString = "[";
  for (int i = 0; i < ary.length; i++){
    newString += arrToString(ary[i]);
    if (i < ary.length - 1){
      newString += ", ";
    }
  }
  return newString += "]";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
  int sum = 0;
  for (int i = 0; i < nums.length; i++){
    for (int x = 0; x < nums[i].length; x++){
      sum += nums[i][x];
    }
  }
  return sum;
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  int [][] newArr = new int [nums[0].length][nums.length];
  for (int i = 0; i < nums.length; i++){
    for (int x = 0; x < nums[i].length; x++){
      newArr[x][i] = nums[i][x];
    }
  }
  return newArr;
}
}
