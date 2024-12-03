import java.util.Arrays;

public class DemoColor{
  public static String [] dino = {
    "               _________",
    "              /         \\",
    "             /   *   *   \\____",
    "            /                 \\",
    "           /                   \\",
    "           \\           o       /",
    "            \\        _________/",
    "     __      |           |     __",
    "    /  \\     |           |    /  \\",
    "___/    \\____|           |___/    \\____",
    "   \\    /                    \\    /",
    "    \\__/                      \\__/",};

    public static final String clearScreen = "\u001b[2J";
    public static final String defaultCursor = "\u001b[2J";
    public static final String hideCursor = "\u001b[?25l";
    public static final String showCursor = "\u001b[?25h";

    public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
    }

  public static void main(String[] args){
    System.out.println(clearScreen);
    int x = 0;
    try{
      for (int j = 0; j < 10; j++){
        for (int i = 0; i < dino.length; i++){
          if (x == 8){
            x = 0;
          }
          System.out.print("\u001b[" + 3 + x + "m");
          System.out.println(dino[i]);
          x++;
          Thread.sleep(200);
        }
        System.out.println(defaultCursor);
      }
    } catch (Exception e){
      System.out.println("need an eraser");
    }

    System.out.print("\u001b[0m");
  }
}
