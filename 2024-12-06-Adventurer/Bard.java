public class Bard extends Adventurer{
  private int age;
  private String hometown;
  private String instrument;

  public Bard(String name, int age, String hometown, String instrument){
    super(name);
    this.age = age;
    this.hometown = hometown;
    this.instrument = instrument;
  }

  public Bard(String name, int age, String hometown, String instrument, int hp){
    super(name, hp);
    this.age = age;
    this.hometown = hometown;
    this.instrument = instrument;
  }
}
