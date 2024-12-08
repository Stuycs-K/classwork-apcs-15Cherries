import java.util.Random;

public class Wizard extends Adventurer{
  private int spellCount;
  private int spellMax;

  public Wizard(String name){
    this(name, 10);
  }

  public Wizard(String name, int hp){
    super(name, hp);
    this.spellMax = 20;
    this.spellCount = spellMax;
  }

  public String getSpecialName(){
    return "Cast Fire Ball";
  }

  public int getSpecial(){
    return spellCount;
  }

  public void setSpecial(int n){
    if (n > spellMax){
      spellCount = spellMax;
    }
    else if (n < 0){
      spellCount = 0;
    }
    else{
      spellCount = n;
    }
  }

  public int getSpecialMax(){
    return spellMax;
  }

  public String attack(Adventurer other){
    Random rand = new Random();
    int damage = rand.nextInt(5) + 3;
    other.applyDamage(damage);
    return(this.getName() + " has inflicted a damge of " + damage + " hp on " + other.getName());

  }

  //heal or buff the target adventurer
  public String support(Adventurer other){
    Random rand = new Random();
    int heal = rand.nextInt(5);
    if (heal + other.getHP() > other.getmaxHP()){
      other.setHP(other.getmaxHP());
    }
    else{
      other.setHP(other.getHP() + heal);
    }
    if (heal == 0){
      return(this.getName() + " was unable to heal " + other.getName());
    }
    else{
      return(this.getName() + " has healed " + other.getName() + " with " + heal + " hp");
    }
  }

  //heall or buff self
  public String support(){
    int heal = 5;
    if (heal + this.getHP() > this.getmaxHP()){
      this.setHP(this.getmaxHP());
    }
    else{
      this.setHP(this.getHP() + heal);
    }
    return(this.getName() + " has healed themself with " + heal + " hp");
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (spellMax >= 4){
      Random rand = new Random();
      int damage = rand.nextInt(6) + 5;
      this.setSpecial(this.getSpecial() - 4);
      other.applyDamage(damage);
      return (this.getName() + " has cast a fireball on " + other.getName() + " and inflicted a damge of " + damage + " hp ");
    }
    else{
      return (this.getName() + " has no power to cast a spell");
    }
  }

  public String toString(){
    return this.getName() + " the Wizard";
  }

}
