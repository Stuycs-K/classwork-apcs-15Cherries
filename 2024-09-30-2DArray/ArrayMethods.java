public class ArrayMethods{

  //1. Write both your names + emails at the top of the document as a comment.
  //Nowar Nizum nnizum60@stuy.edu
  //Raphael Ramot rramot60@stuy.edu

  public static void main (String [] args){
    System.out.println(arrToString(new int [] {2, 3, 4, 9}));
    System.out.println(arrToString(new int [] {5, 3, 1, 0}));
    System.out.println(arrToString(new int [] {}));

    System.out.println(arrToString(new int [] [] { {2, 3, 4}, {5, 6, 7}, {2, 4, 9} }));           //sqaure array
    System.out.println(arrToString(new int [] [] { {2, 3, 4}, {5, 6}, {2, 4, 9, 3} }));           //ragged array
    System.out.println(arrToString(new int [] [] { {} }));                                        //empty array
    System.out.println(arrToString(new int [] [] { {2, 3, 4, 10}, {5, 6, 7, 7}, {2, 4, 9, 8} })); //rectangular array
    System.out.println(arrToString(new int [] [] { {1, 9, 4, 9, 1, 0}, {9, 3, 4, 0, 1}, {3, 7, 5}, {8, 2, 4, 6} }));

    System.out.println(arr2DSum(new int [] [] { {2, 3, 4}, {5, 6, 7}, {2, 4, 9} }));              //sqaure array
    System.out.println(arr2DSum(new int [] [] { {2, 3, 4}, {5, 6}, {2, 4, 9, 3} } ));             //ragged array
    System.out.println(arr2DSum(new int [] [] { {} }));                                           //empty array
    System.out.println(arr2DSum(new int [] [] { {2, 3, 4, 10}, {5, 6, 7, 7}, {2, 4, 9, 8} }));    //rectangular array
    System.out.println(arr2DSum(new int [] [] { {1, 9, 4, 9, 1, 0}, {9, 3, 4, 0, 1}, {3, 7, 5}, {8, 2, 4, 6} }));

    System.out.println(arrToString(swapRC(new int [] [] {{1,2,3},{4,5,6}})));                     //rectangular array
    System.out.println(arrToString(swapRC(new int [] [] { {} })));                                //empty array
    System.out.println(arrToString(swapRC(new int [] [] { {2, 3, 4, 10}, {5, 6, 7, 7}, {2, 4, 9, 8}, {9, 4, 1, 0}}))); //sqaure array
    System.out.println(arrToString(swapRC(new int [] [] { {1, 4, 7, 10}, {3, 9, 12, 30}, {3, 6, 9, 8}, {2, 7, 5, 1}, {4, 1, 3, 8}})));

    int [][] negArr = new int [][] { {2, -3, 6, -9}, {9, -8, 4, 2}, {5, -1, -3, 7} };
    System.out.println("orginal array" + arrToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array" + arrToString(negArr));
    negArr = new int [][] { {} };
    System.out.println("orginal array" + arrToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array" + arrToString(negArr));
    negArr = new int [][] { {-9}, {-10, 9, 3, -8}, {0, -1, -7, -5} };
    System.out.println("orginal array" + arrToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array" + arrToString(negArr));
    negArr = new int [][] { {}, {-10, 3, -8}, {0, -1, -7, -5} };
    System.out.println("orginal array" + arrToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array" + arrToString(negArr));
    negArr = new int [][] { {-3, 4, 5, -7}, {10, -9, 32, -8}, {12, -1, -7, -5}, {2, 3, 8, -9, 1}};
    System.out.println("orginal array" + arrToString(negArr));
    replaceNegative(negArr);
    System.out.println("changed array" + arrToString(negArr));

    int [][] arr = new int [] [] { {2, 3, 4}, {5, 6}, {7, 8, 9, 10}};
    int [][] Copy = copy(arr);
    System.out.println("orginal array: " + arrToString(arr) + " copied array: " + arrToString(Copy));
    arr = new int [] [] { {2, 3, 4}, {5, 6}, {7, 8, 10, 10}};
    System.out.println("only orginal array changed to: " + arrToString(arr) + " copied array: " + arrToString(Copy));
    arr = new int [] [] { {10, 7, 3}, {8, 2, 6}, {9, 1, 4}};
    Copy = copy(arr);
    System.out.println("orginal array: " + arrToString(arr) + " copied array: " + arrToString(Copy));
    arr = new int [] [] { {}};
    Copy = copy(arr);
    System.out.println("orginal array: " + arrToString(arr) + " copied array: " + arrToString(Copy));
    arr = new int [][] { {1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12}, {13, 14}, {15, 16, 17, 18, 19}, {20, 21, 22}};
    Copy = copy(arr);
    System.out.println("orginal array: " + arrToString(arr) + " copied array: " + arrToString(Copy));
    arr = new int [] [] { {10, 7, 3}, {}, {9, 1, 4, 7, 3}};
    Copy = copy(arr);
    System.out.println("orginal array: " + arrToString(arr) + " copied array: " + arrToString(Copy));

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

}
