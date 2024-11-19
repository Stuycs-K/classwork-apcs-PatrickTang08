import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Keypad{
  public static void main(String[] args){
    System.out.println(passcode("Input.txt"));
  }
  public static int passcode(String filename){
    int out = 0;
    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      int[][] pad=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
      int col=1;
      int row=1;
      for(int i=0; sc.hasNextLine();i++){
        String line= sc.nextLine();
        for(int j=0; j<line.length()-1;j++){
          String dir=line.substring(j,j+1);
          if(dir.equals("U")){
            col-=1;
          }
          if(dir.equals("D")){
            col+=1;
          }
          if(dir.equals("L")){
            row-=1;
          }
          if(dir.equals("R")){
            row+=1;
          }
          if(col<0){
            col=0;
          }
          if(col>2){
            col=2;
          }
          if(row<0){
            row=0;
          }
          if(row>2){
            row=2;
          }
        }
        out=""+pad[col][row];
      }
    }catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
      return -9999999;
    }
    return out;
  }
}
