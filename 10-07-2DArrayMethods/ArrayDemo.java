import java.util.Arrays;
public class ArrayDemo{

  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    int [] array = new int [] {1, 2, 3, 4};
    int [][] arr = new int [][] { {0, 7, 8, 0}, {8, 0, 2, 1}, {0, 3, 4, 5, 0}};
    System.out.println("Arrays.toString prints " + Arrays.toString(array) + " and my arrToString prints " + arrToString(array));
    System.out.println("Arrays.deepToString prints " + (Arrays.deepToString(arr)) + " and my arrToString prints " + arrToString(arr));
    System.out.println("------------------------------------------");
    System.out.println(Arrays.deepToString(arr) + " has " + countZeros2D(arr) + " zeros");
    System.out.println("------------------------------------------");
    System.out.println("the elements of " + Arrays.deepToString(arr) + " have a sum of " + arr2DSum(arr));
    System.out.println("------------------------------------------");
    int [][] negArr = new int [][] { {2, -3, 6, -9}, {9, -8, 4, 2}, {5, -1, -3, 7} };
    System.out.println("orginal array: " + Arrays.deepToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array: " + Arrays.deepToString(negArr));
    System.out.println("------------------------------------------");
    int [][] Copy = copy(arr);
    System.out.println("orginal array: " + Arrays.deepToString(arr) + " copied array: " + Arrays.deepToString(Copy));
    arr = new int [] [] { {2, 3, 4}, {5, 6}, {7, 8, 9, 10}};
    System.out.println("orginal array now: " + Arrays.deepToString(arr) + " while copied array remains: " + Arrays.deepToString(Copy));
    System.out.println("------------------------------------------");
    arr = new int [] [] { {2, 3, 4}, {5, 6, 10}, {7, 8, 9}};
    System.out.println(Arrays.deepToString(arr) + " has elements swapped to " + Arrays.deepToString(swapRC(arr)));
    System.out.println("------------------------------------------");
    System.out.println(htmlTable(new int[][]{{1,2},{3}}));                    //rectangular array
    System.out.println(htmlTable(arr));                    //rectangular array
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
    array = new int [] {47, 83, 102, 4, 13};
    arr = new int [][] { {0, 25, 39, 84}, {47, 61, 0, 99, 21}, {63, 0, 59}};
    System.out.println("Arrays.toString prints " + Arrays.toString(array) + " and my arrToString prints " + arrToString(array));
    System.out.println("Arrays.deepToString prints " + (Arrays.deepToString(arr)) + " and my arrToString prints " + arrToString(arr));
    System.out.println("------------------------------------------");
    System.out.println(Arrays.deepToString(arr) + " has " + countZeros2D(arr) + " zeros");
    System.out.println("------------------------------------------");
    System.out.println("the elements of " + Arrays.deepToString(arr) + " have a sum of " + arr2DSum(arr));
    System.out.println("------------------------------------------");
    negArr = new int [][] { {-1, 3, -4, 8, 2}, {8, -4, 3, 5, -1}, {-1, -3, -2, 4, 6}};
    System.out.println("orginal array: " + Arrays.deepToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array: " + Arrays.deepToString(negArr));
    System.out.println("------------------------------------------");
    Copy = copy(arr);
    System.out.println("orginal array: " + Arrays.deepToString(arr) + " copied array: " + Arrays.deepToString(Copy));
    arr = new int [] [] { {2, 3, 4}, {5, 6}, {7, 8, 9, 10}};
    System.out.println("orginal array now: " + Arrays.deepToString(arr) + " while copied array remains: " + Arrays.deepToString(Copy));
    System.out.println("------------------------------------------");
    arr = new int [] [] { {7, 8, 9, 2}, {27, 33, 91, 4}, {62, 35, 71, 99}};
    System.out.println(Arrays.deepToString(arr) + " has elements swapped to " + Arrays.deepToString(swapRC(arr)));
    System.out.println("------------------------------------------");
    System.out.println(htmlTable(arr));                    //rectangular array
    System.out.println("------------------------------------------");
    System.out.println("------------------------------------------");
    array = new int [] {27, 34, 86, 71};
    arr = new int [][] { {0, 0, 27, 6}, {99, 66, 0, 81, 23, 0}, {33, 0, 87, 0, 12, 49, 50}};
    System.out.println("Arrays.toString prints " + Arrays.toString(array) + " and my arrToString prints " + arrToString(array));
    System.out.println("Arrays.deepToString prints " + (Arrays.deepToString(arr)) + " and my arrToString prints " + arrToString(arr));
    System.out.println("------------------------------------------");
    System.out.println(Arrays.deepToString(arr) + " has " + countZeros2D(arr) + " zeros");
    System.out.println("------------------------------------------");
    System.out.println("the elements of " + Arrays.deepToString(arr) + " have a sum of " + arr2DSum(arr));
    System.out.println("------------------------------------------");
    System.out.println(htmlTable(arr));                    //rectangular array
    System.out.println("------------------------------------------");
    negArr = new int [][] { {5, -3, 0}, {7, -2, -6, 1}, {-79, 51, -99, -23, 45}};
    System.out.println("orginal array: " + Arrays.deepToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array: " + Arrays.deepToString(negArr));
    System.out.println("------------------------------------------");
    Copy = copy(arr);
    System.out.println("orginal array: " + Arrays.deepToString(arr) + " copied array: " + Arrays.deepToString(Copy));
    arr = new int [] [] { {2, 3, 4}, {5, 6}, {7, 8, 9, 10}};
    System.out.println("orginal array now: " + Arrays.deepToString(arr) + " while copied array remains: " + Arrays.deepToString(Copy));
    System.out.println("------------------------------------------");
    arr = new int [] [] { {4, 5}, {91, 40} };
    System.out.println(Arrays.deepToString(arr) + " has elements swapped to " + Arrays.deepToString(swapRC(arr)));
    System.out.println("------------------------------------------");
    arr = new int [][] {{}};
    System.out.println(Arrays.deepToString(arr) + " has " + countZeros2D(arr) + " zeros");
    System.out.println(Arrays.deepToString(arr) + " has a sum of " + arr2DSum(arr));
    System.out.println(htmlTable(arr));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String str = "[";
    for (int i = 0; i < ary.length; i++) {
      str += ary[i];
      if (i < ary.length-1)
        str += ", ";
    }
    str += "]";
    return str;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String newString = "[";
    for (int i = 0; i < ary.length; i++){
      newString += arrToString(ary[i]);
      if (i < ary.length - 1){
        newString += ", ";
      }
    }
    return newString += "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        if (nums[i][x] == 0){
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        sum += nums[i][x];
      }
    }
    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int x = 0; x < vals[i].length; x++){
        if (vals[i][x] < 0){
          if (i == x){
            vals[i][x] = 1;
          }
          else{
            vals[i][x] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int [] copyEachArray(int [] array){
    int [] newArray = new int [array.length];
    for (int i = 0; i < array.length; i++){
      newArray[i] = array[i];
    }
    return newArray;
  }
  public static int[][] copy(int[][] nums){
    int [][] copy = new int [nums.length] [nums[0].length];
    for (int i = 0; i < nums.length; i++){
      copy[i] = copyEachArray(nums[i]);
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int [][] newArr = new int [nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int x = 0; x < nums[i].length; x++){
        newArr[x][i] = nums[i][x];
      }
    }
    return newArr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String newString = "<table>";
    for (int i = 0; i < nums.length; i++){
      newString = newString + "<tr>";
      for (int x = 0; x < nums[i].length; x++){
        newString = newString + "<td>" + nums[i][x] + "</td>";
      }
      newString = newString + "</tr>";
    }
    return newString += "</table>";

  }
}
