import java.io.*;
import java.util.*;


public class Keypad{
  public static void main(String[] args){
    System.out.println(passcode("Input.txt"));
  }
  public static int passcode(String filename){
    int out = 0;
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      }
    }catch (Exception ex)
    {
      System.out.println("Exception");
      return 0;
    }
    return out;
  }
}
