//Previously when we called the speak method for the Bird class, Driver called the getName() of the Animal class.
//When we overrode the getName() method, Driver called the new getName() method.

public class Driver{
  public static void main(String[] args){
    Animal cow = new Animal("mooooo", 5, "cow");
    cow.speak();
    Bird blueBird = new Bird ("tweet tweet", 2, "bluebird", 12, "blue");
    blueBird.speak();
  }
}
