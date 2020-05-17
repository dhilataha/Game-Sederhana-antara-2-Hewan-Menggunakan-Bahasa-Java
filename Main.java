class Main{
  public static void main(String []taha){
    Animal cat = new Animal("Kucing",4,30,"merah");
    cat.statusBefore();
    cat.fight();
    cat.eat();
    cat.bathe();
    System.out.println("");
    System.out.println("Updete info");
    cat.statusAfter();

    Animal mouse = new Animal("Tikus", 4, 10,"hitam");
    mouse.fight();
    System.out.println("kodong " + mouse.animalName+"nya kalah, kakinya patah juga");
    System.out.println("Kaki "+mouse.animalName+" sekarang : " +mouse.foot);
  }
}
