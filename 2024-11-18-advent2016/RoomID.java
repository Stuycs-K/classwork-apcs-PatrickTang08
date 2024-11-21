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
          String code=line.substring(line.length()-6,line.length()-1);
          int id= Integer.parseInt(line.substring(line.length()-10,line.length()-7));
          String[] alphabet = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
          int[] count =new int[26];
          String name= line.substring(0,line.length()-11);
          for(int j=0;j<name.length();j++){
            for(int k=0;k<alphabet.length;k++){
              if(name.substring(j,j+1).equals(alphabet[k])){
                count[k]=count[k]+1;
              }
            }
          }
          System.out.println(Arrays.toString(count));
          System.out.println(name);
          System.out.println(code);
          System.out.println(id);
          System.out.println(line);
        }
        return 0;
      }catch (Exception ex){
      System.out.println("Exception");
      return 0;
    }
  }
}
