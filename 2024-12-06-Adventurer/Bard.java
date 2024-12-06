public class Bard extends Adventurer{
  /*private int age;
  private String hometown;
  private String instrument;*/
  private String SpecialName;
  private int Special;
  private int SpecialMax;

  public Bard(String name){
    super(name);
  }

  public Bard(String name, int hp){
    super(name, hp);
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
    return null;
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    return null;
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
