public class Barbarian extends Adventurer{
  private String name;
  private int HP,maxHP;
  private int rage,maxRage;

  public Barbarian(String name){
    super(name);
    rage=10;
    maxRage=10;
  }
  public Barbarian(String name, int hp){
    super(name,hp);
    rage=10;
    maxRage=10;
  }

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Barb Barrel";
  }
  public int getSpecial(){
    return rage;
  }
  public void setSpecial(int n){
    if(n>this.getSpecialMax()){
      this.rage=getSpecialMax();
    }else this.rage=n;
  }
  public int getSpecialMax(){
    return maxRage;
  }
  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.setHP(other.getHP()-3);
    return this.getName()+ " stabs "+other.getName()+".";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.setHP(other.getHP()+1);
    return this.getName()+ " heals "+other.getName()+".";
  }

  //heall or buff self
  public String support(){
    this.setHP(this.getHP()+1);
    return this.getName()+ " self-heals.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    other.setHP(other.getHP()-5);
    this.rage=this.getSpecial()-1;
    return this.getName()+ " rolls on "+other.getName()+".";
  }
}
