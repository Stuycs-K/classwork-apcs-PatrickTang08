import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
  }
  public static int countTrianglesA(String filename){
    int a =0;
    int b =0;
    int c =0;
    try
    {
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      a= sc.nextInt();
      b= sc.nextInt();
      c= sc.nextInt();
      sc.close();
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
      return -9999999;
    }
    return c;
  }
}
