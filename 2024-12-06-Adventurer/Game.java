import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    Barbarian p1= new Barbarian(userName);
    CodeWarrior npc= new CodeWarrior("Bot 1");
    System.out.println(p1.getName()+", "+p1.getHP()+"/"+p1.getmaxHP()+" HP , "+p1.getSpecial()+"/"+p1.getSpecialMax()+" Rage");
    System.out.println(npc.getName()+", "+npc.getHP()+"/"+npc.getmaxHP()+" HP , "+npc.getSpecial()+"/"+npc.getSpecialMax()+" Rage");
    while(p1.getHP()>=0||npc.getHP()>=0){
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move= userInput.nextLine();
      if(move=="a"||move=="attack"){
        p1.attack(npc);
      }else if(move=="sp"||move=="special"){
        p1.specialAttack(npc);
      }else if(move=="su"||move=="support"){
        p1.support();
      }else if(move=="quit"){
          break;
      }
      System.out.println(p1.getName()+", "+p1.getHP()+"/"+p1.getmaxHP()+" HP , "+p1.getSpecial()+"/"+p1.getSpecialMax()+" Rage");
      System.out.println(npc.getName()+", "+npc.getHP()+"/"+npc.getmaxHP()+" HP , "+npc.getSpecial()+"/"+npc.getSpecialMax()+" Rage");
    }
  }
}
