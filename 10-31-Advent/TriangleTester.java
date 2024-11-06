import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TriangleTester{
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }
  public static int countTrianglesA(String filename){
    int out = 0;

    try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      while(sc.hasNextInt())
      {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b>c && a+c>b && b+c>a){
          out++;
        }
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
  public static int countTrianglesB(String filename){
    int out = 0;
    int[] column1 = new int[3];
    int[] column2 = new int[3];
    int[] column3 = new int[3];
    int index = 0;
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextInt()) {
                column1[index] = sc.nextInt();
                column2[index] = sc.nextInt();
                column3[index] = sc.nextInt();
                index++;
                if (index == 3) {
                  if (column1[0] + column1[1] > column1[2] && column1[0] + column1[2] > column1[1] && column1[1] + column1[2] > column1[0]){
                      out++;
                    }
                    if (column2[0] + column2[1] > column2[2] && column2[0] + column2[2] > column2[1] && column2[1] + column2[2] > column2[0]){
                      out++;
                    }
                    if (column3[0] + column3[1] > column3[2] && column3[0] + column3[2] > column3[1] && column3[1] + column3[2] > column3[0]){
                      out++;
                    }
                    index = 0;
                }
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return -9999999;
        }
        return out;
    }
  }
