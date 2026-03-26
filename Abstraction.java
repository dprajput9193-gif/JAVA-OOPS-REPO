// this is ABSTRACTION.
abstract class Animal{
    abstract void walk();   // --> ye animal wala function called nhi hoga na hi print hoga.
public void eat(){
  System.out.println("Eating something..");
}
  }
  class Horse extends Animal{
    public void walk(){
        System.out.println("Walk with 4 legs ");
    }
  }
  class Swan extends Animal{
    public void walk(){
        System.out.println("Walk with 2 legs ");
    }
  }
public class Abstraction {
    public static void main(String[] args){
 Horse h1 = new Horse();
 h1.walk();
 h1.eat();
 Swan s = new Swan();
 s.walk();
 s.eat();
    }
}
