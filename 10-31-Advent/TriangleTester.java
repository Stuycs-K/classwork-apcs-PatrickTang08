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
    int out=0;
    int column1=1;
    int column2=1;
    int column3=1;
    ArrayList<Integer>nums = new ArrayList<Integer>();
     try{
      File file = new File(filename);
      Scanner sc= new Scanner(file);
      while(sc.hasNextInt()){
        nums.add(sc.nextInt());
        for(int i=0;i<nums.size();i+=3){
          if(nums.get(i)%100==nums.get(i+3)%100){
            column1++;
          }
          if(column1==3){
            column1=0;
            out++;
          }
        }
        for(int i=1;i<nums.size();i+=3){
          if(nums.get(i)%100==nums.get(i+3)%100){
            column2++;
          }
          if(column2==3){
            column2=0;
            out++;
          }
        }
        for(int i=2;i<nums.size();i+=3){
          if(nums.get(i)%100==nums.get(i+3)%100){
            column3++;
          }
          if(column3==3){
            column3=0;
            out++;
          }
        }
      }
    }
    catch (FileNotFoundException ex){
      System.out.println("File not found");
      return -9999999;
    }
    return out;
  }
}
