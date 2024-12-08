import java.util.Random;

public class Driver{
  public static void main (String [] args){
    //Adventurer George = new Bard("George", 10);
    Adventurer George = new Bard("George", 7, 11);
    System.out.println(George);

    //Adventurer Toby = new Wizard("Toby", 10);
    Adventurer Toby = new Wizard("Toby", 12, 16);
    System.out.println(Toby);

    System.out.println(George + " can sing " + George.getSpecialName() + ". He has " + George.getSpecial() + " " + George.getSpecialName() + " right now but can sing at most " + George.getSpecialMax() + " " + George.getSpecialName() + ". Let's set his " + George.getSpecialName() + " to " + George.getSpecialMax() + ".");
    George.setSpecial(George.getSpecialMax());
    System.out.println(George + " has " + George.getSpecial() + " " + George.getSpecialName());

    System.out.println(Toby + " can use " + Toby.getSpecialName() + ". He has " + Toby.getSpecial() + " " + Toby.getSpecialName() + " right now but can have at most " + Toby.getSpecialMax() + " " + Toby.getSpecialName() + ". Let's set his " + Toby.getSpecialName() + " to " + Toby.getSpecialMax()+ ".");
    Toby.setSpecial(Toby.getSpecialMax());
    System.out.println(Toby + " has " + Toby.getSpecial() + " " + Toby.getSpecialName());

    ////////////////////////////////////////////////////////////////////////////

    System.out.println(George.attack(Toby));
    System.out.println(Toby.attack(George));
    System.out.println(George.support(Toby));
    System.out.println(Toby.support(George));

    System.out.println(George.specialAttack(Toby));
    System.out.println(Toby.specialAttack(George));
    System.out.println(George.support());
    System.out.println(Toby.support());

    ////////////////////////////////////////////////////////////////////////////

    System.out.println(George.specialAttack(Toby));
    System.out.println(Toby.specialAttack(George));
    System.out.println(George.specialAttack(Toby));
    System.out.println(Toby.specialAttack(George));
    System.out.println(George.specialAttack(Toby));
    System.out.println(Toby.specialAttack(George));

    Random rand1 = new Random();
    int restoreGeorge = rand1.nextInt(11) + 1;
    Random rand2 = new Random();
    int restoreToby = rand2.nextInt(16) + 1;
    System.out.println(George.restoreSpecial(restoreGeorge));
    System.out.println(George.restoreSpecial(restoreToby));
    System.out.println(George + " has " + George.getSpecial() + " " + George.getSpecialName());
    System.out.println(Toby + " has " + Toby.getSpecial() + " " + Toby.getSpecialName());


  }
}
