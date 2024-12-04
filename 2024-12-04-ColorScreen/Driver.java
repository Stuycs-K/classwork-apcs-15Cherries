import java.util.Random;

public class Driver{
  //MODIFIERS
  public static final int BRIGHT = 1;
  public static final int DARK = 2;
  public static final int ITALICS = 3;
  //COLORS
  public static final int BLACK = 30;
  public static final int RED = 31;
  public static final int GREEN = 32;
  public static final int YELLOW = 33;
  public static final int BLUE = 34;
  public static final int MAGENTA = 35;
  public static final int CYAN = 36;
  public static final int WHITE = 37;
  //CONTROLS
  public static final String CLEAR_SCREEN =  "\033[2J";
  public static final String HIDE_CURSOR =  "\033[?25l";
  public static final String SHOW_CURSOR =  "\033[?25h";

  //use this to go back to normal terminal before exiting.
  public static final String RESET = "\033[0m"+SHOW_CURSOR;

  //use this to convert from color to background (30 to 37 becomes 40 to 47)
  public static int  background(int color){
    return color + 10;
  }

  //terminal specific character to move the cursor to a location
  //top left is 1,1
  //row is y (higher numbers go down)
  //column is x
  public static void go(int row,int col){
      System.out.print("\033[" + row + ";" + col + "H");
  }

  //Overloarded color commands (give 1 or more colors/modifiers)
  public static void color(int m){
    System.out.print ("\033[;" + m + "m");
  }
  public static void color(int m1, int m2){
    System.out.print ("\033["+ m1 + ";" + m2 + "m");
  }
  public static void color(int m1, int m2, int m3){
    System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
  }
  public static void color(int m1, int m2, int m3, int m4){
    System.out.print ("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
  }

  //And don't forget you can easily delay the printing if needed:
  public static void wait(int millis){
    try {
      Thread.sleep(millis);
    }
      catch (InterruptedException e) {
    }
  }

  //erase (black bakground)
  public static void erase(int r, int c, int size){
    go(r,c);
    System.out.print("\033[0m");
    for(int i = 0; i < size;i++){
      System.out.print(" ");
    }
  }

  ///////////////////////////////////////////////////////////////////////

  public static int [] randomArray(){
    int [] random = new int [3];
    Random x = new Random();
    for (int i = 0; i < random.length; i++){
      random[i] = x.nextInt(100);
    }
    return random;
  }

  /////////////////////////////////////////////////////////////////////////
  public static String [] flower = {
    "             @@@",
    "            @@@@@",
    "             @@@",
    "          @@@@@@@@@",
    "         @@@@@@@@@@@",
    "          @@@@@@@@@",
    "             @@@" ,
    "             @@@" ,
    "          \\\\|||||//",
    "           \\|~~~|/",
    "            |~~~|"   ,
    "            |~~~|" ,
    "            |~~~|",
    "            |~~~|" ,
    "            |___|    "};

  public static int [] rainbow = {RED, YELLOW, GREEN, BLUE, MAGENTA};

  public static void rainbowLine(int i){
    color(rainbow[i % rainbow.length], background(rainbow[(i + 1) % rainbow.length]));
  }

  public static void printLine (int row, int column, int limit, String character){
    for (int i = 0; i <= limit; i++){
      go (row, column);
      rainbowLine(i);
      System.out.print(character);
    }
  }

  public static void printLine (int row, int limit, String character){
    for (int i = 0; i <= limit; i++){
      go (row, i);
      rainbowLine(i);
      System.out.print(character);
    }
  }

  public static void printColumn (int column, int limit, String character){
    for (int i = 2; i <= limit; i++){
      go (i, column);
      rainbowLine(i);
      System.out.print(character);
    }
  }

  public static void main(String[]args){
    final int width = 80;
    final int height = 30;
    int [] random = randomArray();

    System.out.print(CLEAR_SCREEN + HIDE_CURSOR);

    //top row
    printLine(1, width, " ");

    System.out.print(RESET);

    //row of random integers
    for (int i = 0; i < random.length; i++){
      int space = (width / (random.length+1)) * (i+1);
      go(2, space);
      int number = random[i];
      if (number < 25){
        color(RED + 60);
      }
      else if (number > 75){
        color(GREEN + 60);
      }
      else{ color(WHITE);}
      System.out.print(random[i]);
    }

    //horizontal separator
    for (int i = 0; i < width; i++){
      go(3,i);
      color(rainbow[4]);
      System.out.println("*");
    }

    for (int i = 0; i < flower.length; i++){
      go(i+9, 26);
      if (i < 8){
        color(RED + 60);
      }
      else{ color(GREEN + 60);}
      System.out.println(flower[i]);
    }

    //left and right borders
    printColumn(1, height, " ");
    printColumn(width, height, " ");

    //bottom border
    printLine(height, width, " ");

    // Reset terminal and show cursor when finished
    System.out.print(RESET);
    go(31,1);



  }
}
