/*Previously when we called the speak method for the Bird class, Driver called the getName() that was associated with the Animal class. When we
overrode the getName() method in the Bird class, this change was also saved in the Animal class for objects specified as Birds. Thus, when Driver
called speak() for the bird and it called the speak() method of the Animal class that used getName(), it used the getName() associated with Birds.*/
/*Assigning a bird object as an animal object failed because it is not true that an animal is-a bird, as bird is only a subclass of the superclass
animal, which means an object type bird cannot  be classified as an animal. However, bird is-a animal,so an object type animal can be specified as
the type bird, so case 4 works. The first two simply assign an object as the type they are, so they work as well.*/

public class Driver{
  public static void main(String[] args){
    Animal cow = new Animal("mooooo", 5, "cow");
    cow.speak();
    Bird blueBird = new Bird ("tweet tweet", 2, "bluebird", 12, "blue");
    blueBird.speak();

    Animal dog = new Animal ("bark", 4, "Coco");
    Bird sparrow = new Bird ("chirp", 7, "sparrow", 5, "brown");
    //Bird hummingBird = new Animal ("hmmmm", 3, "humming bird", 3, "red");
    Animal penguin = new Bird ("plop", 5, "penguin", 10, "black");
    dog.speak();
    sparrow.speak();
    penguin.speak();

  }
}
