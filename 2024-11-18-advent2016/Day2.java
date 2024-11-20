public class Day2{

  public static String code (String [] data){
    int [][] keypad = new int [][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    String bCode = "";
    int start = keypad[1][1];
    int row = 0;
    int column = 0;
    for (int i = 0; i < data.length; i++){
      for (int x = 0; x < data[i].length(); x++){
        char direction = data[x].charAt(i);
        if (direction == 'U'){
          if (row != 0){
            row --;
          }
        }
        else if (direction == 'D'){
          if (row != 2){
            row ++;
          }
        }
        else if (direction == 'R'){
          if (column != 2){
            row ++;
          }
        }
        else if (direction == 'L'){
          if (column != 0){
            row --;
          }
        }
      }
      bCode += keypad[row][column];
      //char direction = data.charAt(i);
    }
    return null;
  }
  public static void main (String[] args){
    System.out.println(code(new String [] {"RURURU", "R"}));
  }
}
