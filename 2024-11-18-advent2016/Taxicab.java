import java.io.*;
import java.util.*;

public class Taxicab{
  public static void main(String[] args){
    System.out.println(distance("Input.txt"));
    System.out.println(bunnyHQ("Input.txt"));
  }
  public static int distance(String filename){
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      String line = sc.nextLine();
      String[] move=line.split(", ");
      int dir=0;
      int[] step=new int[4];
      for(int i=0;i<move.length;i++){
        String turn = move[i].substring(0,1);
        if(turn.equals("R")){
          dir = (dir + 1) % 4;
        }else dir = (dir + 3) % 4;
        step[dir]=step[dir]+Integer.parseInt(move[i].substring(1));
      }
      return step[0]-step[2]+step[1]-step[3];
    }catch (Exception e){
      System.out.println("Exception");
      return 0;
    }
  }
  public static int bunnyHQ(String filename){
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      String line = sc.nextLine();
      String[] move=line.split(", ");
      int dir=0;
      int x=0;
      int y=0;
      ArrayList<int[]> visited = new ArrayList<int[]>();
      visited.add(new int[]{x,y});
      for(int i=0; i<move.length; i++){
        String turn = move[i].substring(0,1);
        if(turn.equals("R")){
          dir =(dir + 1) % 4;
        }else dir= (dir + 3) % 4;
        int distance= Integer.parseInt(move[i].substring(1));
        for (int j=0; j<distance; j++) {
           if (dir==0) y++;
           else if (dir==1) x++;
           else if (dir==2) y--;
           else if (dir==3) x--;
           for (int k= 0; k <visited.size(); k++) {
            int[] coord = visited.get(k);
            if (coord[0]==x && coord[1]==y) {
                return Math.abs(x) + Math.abs(y);
            }
         }

         visited.add(new int[]{x,y});
     }
      }
      return 0;
    }catch (Exception e){
      System.out.println("Exception");
      return 0;
    }
  }
}
