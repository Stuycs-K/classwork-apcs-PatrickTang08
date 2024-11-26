import java.util.*;

public class Signals{
  public static void main(String[] args) {

  }
  public static String message(String filename){
    String out="";
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      for(int i=0;sc.hasNextLine();i++){
        String line =sc.nextLine();
        for(int j=0;j<line.length();j++){
          if(){

          }
        }
      }
    }catch(Exception e){
      System.out.println("Exception");
      return "";
    }
}
