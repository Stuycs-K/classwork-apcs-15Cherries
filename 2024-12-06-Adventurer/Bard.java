import java.util.Random;

public class Bard extends Adventurer{
  private int songCount;
  private int songMax;
  //attack power ??

  public Bard(String name){
    this(name, 10, 10);
  }

  public Bard(String name, int hp, int songMax){
    super(name, hp);
    this.songMax = songMax;
    this.songCount = songMax;
  }

  public String getSpecialName(){
    return "Songs";
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
    if (songCount > 0){
      Random rand = new Random();
      int songDamage = rand.nextInt(this.getSpecial()) + 1;
      this.setSpecial(this.getSpecial() - songDamage);
      other.applyDamage(songDamage);
      return (this.getName() + " has inflicted a damge of " + songDamage + " hp on " + other.getName() + " through their musical prowess");
    }
    else{
      return (this.getName() + " has lost their voice and can't sing");
    }
  }

}
