import java.io.*;
import java.util.*;

public class Taxicab{
  public static void main(String[] args){
    String[]data= parse("Input.txt");
    System.out.println(parse("Input.txt"));
  }
  public static String[] parse(String filename){
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      String line = sc.nextLine();
      return line.split(", ");
    }catch (Exception e)
    {
      System.out.println("Exception");
      String[]a=new String[1];
      return a;
    }
  }
  public static int distance(String[]data){
    int x = 0, y = 0, dir = 0;
    for(int i=0; i < data.length; i++){
      String heading = data[i].substring(0,1);
      int dis = Integer.parseInt(data[i].substring(1,2));
    }
    return 0;
  }
}
