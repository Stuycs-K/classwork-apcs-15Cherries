import java.util.Arrays;

public class DemoColor{
  static String [] dino = {
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


  public static void main(String[] args){
    //System.out.print("\u001b[" + 3 + 1 + ";" + 7 + 1 + "m");
    //System.out.print("\u001b[31m");
    int x = 0;
    for (int i = 0; i < dino.length; i++){
      if (x == 8){
        x = 0;
      }
      System.out.print("\u001b[" + 3 + x + "m");
      System.out.println(dino[i]);
      x++;
    }
  }
}
