import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
  }
  public static int countTrianglesA(String filename){
    int out = 0;

    try
    {
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      while(sc.hasNextInt())
      {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b>c && a+c>b && b+c>a)
          out++;
      }
      sc.close();
    }
    catch (FileNotFoundException ex)
    {
      System.out.println("File not found");
      return -9999999;
    }
    return out;
  }
}
