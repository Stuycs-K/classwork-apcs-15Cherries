public class Bard extends Adventurer{
  private String SpecialName;
  private int Special;
  private int SpecialMax;
  //attack power ??

  public Bard(String name){
    super(name);
    this.SpecialName = "Ballads";     //skill is singing
    this.Special = 5;                 //created with 5 ballads
    this.SpecialMax = 52;             //can only sing 52 ballads at at ime
  }

  public Bard(String name, int hp){
    super(name, hp);
    this.SpecialName = "Ballads";
    this.Special = 5;
    this.SpecialMax = 52;
  }

  public String getSpecialName(){
    return SpecialName;
  }

  public int getSpecial(){
    return Special;
  }

  public void setSpecial(int n){
    Special = n;
  }

  public int getSpecialMax(){
    return SpecialMax;
  }

  public String attack(Adventurer other){
    return "bring to sleep";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    return "heal the mind";
  }

  //heall or buff self
  public String support(){
    return null;
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    return null;
  }

}
