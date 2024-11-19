import java.io.*;
import java.util.*;


public class RoomID{
  public static void main(String[] args){
    System.out.println(idsum("Input.txt"));
  }
  public static int idsum(String filename){
    int out = 0;
      try{
        File file = new File(filename);
        Scanner sc= new Scanner(file);
        for(int i=0;sc.hasNextLine();i++){
          String line = sc.nextLine();
          String[] a = line.split("-");
          String code=a[a.length-1].substring(4,9);
          int id= Integer.parseInt(a[a.length-1].substring(0,3));
          System.out.println(code);
          System.out.println(id);
          System.out.println(Arrays.toString(a));
        }
        return 0;
      }catch (Exception ex){
      System.out.println("Exception");
      return 0;
    }
  }
}
