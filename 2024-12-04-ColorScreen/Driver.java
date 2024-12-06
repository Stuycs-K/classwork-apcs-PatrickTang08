import java.util.Random;

public class Driver{
  public static void main(String[] args) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    Text.color(Text.BLUE, Text.background(Text.BLUE));
    drawBorder(80,30);
    int[] nums=new int[3];
    Random rng= new Random();
    for(int i=0;i<3;i++){
        System.out.println(Text.RESET);
        nums[i] = rng.nextInt(100);
        Text.go(2,i*20+20);
        if(nums[i]>75){
          Text.color(Text.GREEN,Text.BRIGHT);
        }else if(nums[i]<25){
          Text.color(Text.RED,Text.BRIGHT);
        }else Text.color(Text.WHITE);
        System.out.print(nums[i]);
    }
    drawHorizontalSeparator(3,80);
    drawSmileyFace(80,30);
    System.out.println(Text.RESET);
    Text.go(31, 1);
  }
  public static void drawBorder(int width, int height) {
    for(int col= 1;col<=width;col++) {
        Text.go(1,col);
        System.out.print("o");
        Text.go(height,col);
        System.out.print("o");
    }
    for (int row= 1;row<=height;row++) {
        Text.go(row,1);
        System.out.print("o");
        Text.go(row,width);
        System.out.print("o");
    }
  }
  public static void drawHorizontalSeparator(int row, int width) {
    Text.color(Text.BLUE, Text.background(Text.BLUE), Text.BRIGHT);
    for(int col= 1;col<=width;col++) {
        Text.go(row,col);
        System.out.print("-");
    }
  }
  public static void drawSmileyFace(int width, int height) {
    int centerRow= height/2;
    int centerCol= width/2;
    Text.color(Text.YELLOW, Text.background(Text.BLACK), Text.BRIGHT);
    Text.go(centerRow-5,centerCol-20);
    System.out.print("Making this face took way longer than it should have...");
    Text.color(Text.RED, Text.background(Text.BLACK), Text.BRIGHT);
    Text.go(centerRow-2,centerCol-4);
    System.out.print("O");
    Text.go(centerRow-2,centerCol+4);
    System.out.print("O");
    Text.go(centerRow-1,centerCol-4);
    System.out.print("-");
    Text.go(centerRow-1,centerCol+4);
    System.out.print("-");
    Text.go(centerRow,centerCol);
    System.out.print("-");
    Text.go(centerRow+3,centerCol-4);
    System.out.print("|");
    Text.go(centerRow+2,centerCol-3);
    System.out.print("_");
    Text.go(centerRow+2,centerCol-2);
    System.out.print("_");
    Text.go(centerRow+2,centerCol-1);
    System.out.print("_");
    Text.go(centerRow+2,centerCol);
    System.out.print("_");
    Text.go(centerRow+2,centerCol+1);
    System.out.print("_");
    Text.go(centerRow+2,centerCol+2);
    System.out.print("_");
    Text.go(centerRow+2,centerCol+3);
    System.out.print("_");
    Text.go(centerRow+3,centerCol+4);
    System.out.print("|");
}
}
