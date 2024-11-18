import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Taxicab{
  public static void main(String[] args){
    System.out.println(distance("Input.txt"));
  }
  public static int distance(String filename){
    int out = 0;
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      while(sc.hasNextInt()){
        String dir=sc.next();
        int a = sc.nextInt();
        if(dir.equals("L")){
          out+=a;
        }else out-=a;
      }
    }catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
      return -9999999;
    }
    return out;
  }
}
