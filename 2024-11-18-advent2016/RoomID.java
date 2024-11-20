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
          String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
          int[] count =new int[26];
          for(int j=0; i<alphabet.length;j++){
            icount[j]=count[j]+1;
          }
          System.out.println(Arrays.toString(alphabet));
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
