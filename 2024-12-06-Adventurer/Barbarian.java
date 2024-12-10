public class Barbarian extends Adventurer{
  private String name;
  private int HP,maxHP;
  private int rage,maxRage;

  public Barbarian(String name){
    super(name);
    rage=6;
    maxRage=10;
  }
  public Barbarian(String name, int hp){
    super(name,hp);
    rage=6;
    maxRage=10;
  }

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Battle Ram";
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
    other.applyDamage(4);
    restoreSpecial(1);
    return this+ " stabbed "+other+" and dealt 4 damage.";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    other.setHP(other.getHP()+1);
    other.restoreSpecial(3);
    return this+ " gived "+other+" steroids to heal 1 HP and restore 3 rage.";
  }

  //heall or buff self
  public String support(){
    setHP(getHP()+1);
    restoreSpecial(3);
    return this+ " took anger-inducing pills to heal 1 HP and restore 3 rage.";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if(this.getSpecial()>=6){
      other.applyDamage(6);
      this.rage=this.getSpecial()-6;
    }else{
      attack(other);
      return "Not angry enough to use Battle Ram. "+this+ " stabbed "+other+" and dealt 4 damage.";
    }
    return this+ " took a big log and charged at "+other+", knocking them down and dealing 6 damage.";
  }
}
