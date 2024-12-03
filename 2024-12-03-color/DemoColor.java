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
    for (int i = 0; i < dino.length; i++){
      System.out.print("\u001b[" + 30 + i + ";" + 70 + i + "m");
      System.out.println(dino[i]);
    }
  }
}
