import java.io.*;
import java.util.*;

public class Taxicab{
  public static void main(String[] args){
    String[]data= parse("Input.txt");
    System.out.println(distance(data));
  }
  public static String[] parse(String filename){
    int out = 0;
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      String line = sc.nextLine();
      return line.split(", ");
    }catch (Exception e)
    {
      System.out.println("File not found");
      return "Exception";
    }
    return null;
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
