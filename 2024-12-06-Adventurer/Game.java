import java.util.Scanner;
import java.util.Random;

public class Game{

  public static void opponentMove(Adventurer bot, Adventurer other){
    Random rand = new Random();
    int chance = rand.nextInt(2)+1;
    if (bot.getHP() < 4 && other.getHP() < 4 ){
      if (chance == 1){
        System.out.println(bot.support());
      }
      if (chance == 2){
        System.out.println(bot.attack(other));
      }
    }
    else if (other.getHP() > other.getmaxHP() / 2 && bot.getSpecial() > 7){
      System.out.println(bot.specialAttack(other));
    }
    else{
      System.out.println(bot.attack(other));
    }
  }

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

    //System.out.println(player + ", " + player.getHP() + "/" + player.getmaxHP() + ", " + player.getSpecial() + "/" + player.getSpecialMax());
    //System.out.println(opponent + ", " + opponent.getHP() + "/" + opponent.getmaxHP() + ", " + opponent.getSpecial() + "/" + opponent.getSpecialMax());


    String input = "null";
    while (!input.equals("quit") && opponent.getHP() > 0 && player.getHP() > 0){
      System.out.println("-------------------------------------------------");
      System.out.println(player + ", " + player.getHP() + "/" + player.getmaxHP() + ", " + player.getSpecial() + "/" + player.getSpecialMax());
      System.out.println(opponent + ", " + opponent.getHP() + "/" + opponent.getmaxHP() + ", " + opponent.getSpecial() + "/" + opponent.getSpecialMax());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      input = userInput.nextLine();

      if (! (input.equals("a") || input.equals("sp") || input.equals("su") || input.equals("quit"))){
        System.out.println("invalid input. please type again");
        break;
      }

        if (input.equals("a")){
          System.out.println(player.attack(opponent));
          opponentMove(opponent, player);
        }
        if (input.equals("sp")){
          System.out.println(player.specialAttack(opponent));
          opponentMove(opponent, player);
        }
        if (input.equals("su")){
          System.out.println(player.support());
          opponentMove(opponent, player);
        }
    }

    System.out.println("done");


  }
}
