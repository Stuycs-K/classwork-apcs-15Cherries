import java.util.Random;

public class Bard extends Adventurer{
  private int songCount;
  private int songMax;
  //attack power ??

  public Bard(String name){
    this(name, 10);
  }

  public Bard(String name, int hp){
    super(name, hp);
    this.songMax = 50;
    this.songCount = songMax;
  }

  public String getSpecialName(){
    return "Sing Song";
  }

  public int getSpecial(){
    return songCount;
  }

  public void setSpecial(int n){
    if (n > songMax){
      songCount = songMax;
    }
    else if (n < 0){
      songCount = 0;
    }
    else{
      songCount = n;
    }
  }

  public int getSpecialMax(){
    return songMax;
  }

  public String attack(Adventurer other){
    Random rand = new Random();
    int damage = rand.nextInt(5) + 1;
    other.applyDamage(damage);
    return(this.getName() + " has inflicted a damge of " + damage + " hp on " + other.getName());

  }

  //heal or buff the target adventurer
  public String support(Adventurer other){
    Random rand = new Random();
    int heal = rand.nextInt(5) + 3;
    if (heal + other.getHP() > other.getmaxHP()){
      other.setHP(other.getmaxHP());
    }
    else{
      other.setHP(other.getHP() + heal);
    }
    return(this.getName() + " has healed " + other.getName() + " with " + heal + " hp");
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
