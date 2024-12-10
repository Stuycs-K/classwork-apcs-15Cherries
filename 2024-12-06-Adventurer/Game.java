import java.util.Scanner;
import java.util.Random;

public class Game{

  public static void opponentMove(Adventurer bot, Adventurer other){
    Random rand = new Random();
    int chance = rand.nextInt(2)+1;
    if (bot.getHP() < 4){
      if (other.getHP() < 4){
        if (chance == 1){
          System.out.println(bot.support());
        }
        if (chance == 2){
          System.out.println(bot.attack(other));
        }
      }
      else{
        System.out.println(bot.support());
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

    String input = "null";
    while (!input.equals("quit") && opponent.getHP() > 0 && player.getHP() > 0){
      System.out.println("-------------------------------------------------");
      System.out.println(player + ", " + player.getHP() + "/" + player.getmaxHP() + " HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println(opponent + ", " + opponent.getHP() + "/" + opponent.getmaxHP() + " HP, " + opponent.getSpecial() + "/" + opponent.getSpecialMax() + " " + opponent.getSpecialName());

      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      input = userInput.nextLine();

      if (! (input.equals("a") || input.equals("sp") || input.equals("su") || input.equals("quit"))){
        System.out.println("invalid input. please type again");
      }

        if (input.equals("a")){
          System.out.println(player.attack(opponent));
          if (opponent.getHP() > 0){
            opponentMove(opponent, player);
          }
        }
        else if (input.equals("sp")){
          System.out.println(player.specialAttack(opponent));
          if (opponent.getHP() > 0){
            opponentMove(opponent, player);
          }
        }
        else if (input.equals("su")){
          System.out.println(player.support());
          if (opponent.getHP() > 0){
            opponentMove(opponent, player);
          }
        }
    }
    if (input.equals("quit")){
      System.out.println("Forfeit means loss. Never forget this shame.");
    }
    else if (opponent.getHP() > 0){
      System.out.println("You have died. Remember to learn from your mistakes.");
    }
    else{
      System.out.println("You have slain your enemy. You deserve a celebration.");
    }


  }
}
