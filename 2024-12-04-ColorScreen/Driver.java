public class Driver{
  public static void main(String[] args) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    drawBorder(80,30);
    Text.go(31, 1);
    System.out.println(Text.RESET);
  }
  public static void drawBorder(int width, int height) {
    Text.color(Text.BLUE, Text.background(Text.BLUE));
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
}
