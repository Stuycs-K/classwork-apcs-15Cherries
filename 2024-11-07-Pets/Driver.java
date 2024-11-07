public class Driver{
  public static void main(String[] args){
    Animal cow = new Animal("mooooo", 5, "cow");
    cow.speak();
    Bird blueBird = new Bird ("tweet tweet", 2, "bluebird", 12, "blue");
    blueBird.speak();
  }
}
