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
    Adventurer opponent = new CodeWarrior("Opponent");

    System.out.println(player + ", " + player.getHP() + "/" + player.getmaxHP() + ", " + player.getSpecial() + "/" + player.getSpecialMax());
    System.out.println(opponent + ", " + opponent.getHP() + "/" + opponent.getmaxHP() + ", " + opponent.getSpecial() + "/" + opponent.getSpecialMax());

    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

    String input = userInput.nextLine();
    while (!input.equals("quit")){
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      if (! (input.equals("a") || input.equals("sp") || input.equals("su") || input.equals("quit"))){
        System.out.println("invalid input. please type again");
        break;
      }
      if (opponent.getHP() > 0 && player.getHP() > 0){
        if (input.equals("a")){
          System.out.println(player.attack(opponent));
          break;
        }
        if (input.equals("sp")){
          System.out.println(player.specialAttack(opponent));
          break;
        }
        if (input.equals("su")){
          System.out.println(player.support());
          break;
        }
      }
    }

    System.out.println("done");


  }
}
