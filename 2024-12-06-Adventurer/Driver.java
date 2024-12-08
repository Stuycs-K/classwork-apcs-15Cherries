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
    System.out.println(Toby + " can use " + Toby.getSpecialName() + ". He has " + Toby.getSpecial() + " " + Toby.getSpecialName() + " right now but can have at most " + Toby.getSpecialMax() + " " + Toby.getSpecialName() + ". Let's set his " + Toby.getSpecialName() + " to " + Toby.getSpecialMax()+ ".");
    Toby.setSpecial(Toby.getSpecialMax());
  }
}
