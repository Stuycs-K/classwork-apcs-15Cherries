import java.util.Scanner;

public class Game{
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    //////////////////////////////////////////////////////////////////////

    Adventurer player = new Bard(userName);

    System.out.println(player + ", " + player.getHP() + "/" + player.getmaxHP() + ", " + player.getSpecial() + "/" + player.getSpecialMax());

    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

    String task = userInput.nextLine();
    while (!task.equals("quit")){
      if (! (task.equals("a") || task.equals("sp") || task.equals("su") || task.equals("quit"))){
        System.out.println("invalid input. please type again");
      }
    }

    System.out.println("done");


  }
}
