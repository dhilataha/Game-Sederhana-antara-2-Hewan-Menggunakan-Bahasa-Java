public class Animal{
  String animalName = "";
  int foot = 0;
  int weight = 0;
  String fur = "Merah";

  public Animal(String name, int foot, int weight, String fur){
    this.animalName = name;
    this.foot = foot;
    this.weight = weight;
    this.fur = fur;
  }

  public void eat(){
    weight += 1;

  }
  public void fight(){
    foot -= 1;
  }
  public void bathe(){
    fur = "cream";
  }

  public void statusBefore(){
    System.out.println("Nama Hewan: " +this.animalName);
    System.out.println("Berat Badan: " +this.weight);
    System.out.println("Jumlah Kaki: " +this.foot);
    System.out.println("Warna tubuh: " +this.fur);

  }
  public void statusAfter(){
    System.out.println(this.animalName+" sudah makan gemukmi sedikit tawwa");
    System.out.println("Berat Badan " +this.animalName + ": " +this.weight);
    System.out.println(this.animalName+" sudah berkelahi, cidera i. Patah kakinya kodong");
    System.out.println("Jumlah Kaki " +this.animalName + ": " +this.foot);

    System.out.println(this.animalName+"sudah mandi, warnanya berubah jadi "+this.fur);

  }
}

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
    System.out.println("kodong" + mouse.animalName+"kalah, kakinya patah juga");
    System.out.println("Kaki Tikus sekarang : " +mouse.foot);
  }
}
