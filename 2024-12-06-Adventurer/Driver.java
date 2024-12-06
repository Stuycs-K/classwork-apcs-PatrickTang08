public class Driver{
  public static void main(String[] args) {
    Adventurer p1= new Barbarian("John", 10);
    Adventurer p2= new Barbarian("Sam", 10);
    System.out.println(p1.getName()+": "+p1.getHP()+" HP");
    System.out.println(p2.getName()+": "+p2.getHP()+" HP");
    System.out.println(p1.attack(p2));
    System.out.println(p2.getName()+": "+p2.getHP()+" HP");
    System.out.println(p2.support());
    System.out.println(p2.getName()+": "+p2.getHP()+" HP");
    System.out.println(p1.attack(p2));
    System.out.println(p2.getName()+": "+p2.getHP()+" HP");
    System.out.println(p2.specialAttack(p1));
    System.out.println(p1.getName()+": "+p1.getHP()+" HP");
    System.out.println(p1.support(p2));
    System.out.println(p2.getName()+": "+p2.getHP()+" HP");
  }
}
