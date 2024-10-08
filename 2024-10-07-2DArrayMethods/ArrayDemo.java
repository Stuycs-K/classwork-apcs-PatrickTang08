import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    System.out.println("Expected: 5. My method: "+countZeros2D(new int[][] {{0,1,2,3}, {1,2,3,4}, {0,0,0,0}}));
    System.out.println("Expected: 0. My method: "+countZeros2D(new int[][] {{},{}}));
    System.out.println("Expected: 1. My method: "+countZeros2D(new int[][] {{0,1,2,3}, {1,2,3,4}, {}}));
    System.out.println("Expected: 3. My method: "+countZeros2D(new int[][] {{0}, {0}, {0}}));
    System.out.println("Expected: 5. My method: "+countZeros2D(new int[][] {{0,1,2,3}, {1,2,30,4}, {4,20,50,9}}));
    System.out.println("My method: "+htmlTable(new int[][] {{0,1,2,3}, {1,2,30,4}, {4,20,50,9}}));
    System.out.println("My method: "+htmlTable(new int[][] {{0,1,2,3}, {1,2,3,4}, {0,0,0,0}}));
    System.out.println("My method: "+htmlTable(new int[][] {{},{}}));
    System.out.println("My method: "+htmlTable(new int[][] {{0,1,2,3}, {1,2,3,4}, {}}));
    System.out.println("My method: "+htmlTable(new int[][] {{0}, {0}, {0}}));


  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String s="[";
    for(int i=0; i<ary.length;i++){
      s+=ary[i];
      if(i<ary.length-1){
        s+=", ";
      }
    }
    return s+"]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String s="[";
    for(int i=0; i<ary.length;i++){
      s+=arrToString(ary[i]);
      if(i<ary.length-1){
        s+=", ";
      }
    }
    return s+"]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
      int zeros=0;
      for(int i=0;i<nums.length;i++){
        for(int j=0; j<nums[i].length;j++){
          if(nums[i][j]==0){
            zeros++;
          }
        }
      }
      return zeros;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }

    return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i<vals.length; i++){
      for (int j = 0; j<vals[i].length; j++){
        if (vals[i][j]<0){
          if (j == i){
             vals[i][j] = 1;
          }
          else vals[i][j] = 0;
        }
      }
    }
    System.out.println(arrToString(vals));
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] copied=new int[nums.length][];
    for(int i=0;i<nums.length;i++){
      copied[i]=new int[nums[i].length];
      for(int j=0;j<nums[i].length;j++){
        copied[i][j]=nums[i][j];
      }
    }
    return copied;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int R = nums.length;
    int C = nums[0].length;
    int[][] newArr = new int[C][R];
    for (int i = 0; i < R; i++) {
      for(int j = 0; j < C; j++){
        newArr[j][i]=nums[i][j];
      }
    }
    return newArr;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String html="<table>";
    for(int i=0;i<nums.length;i++){
      html+="<tr>";
      for(int j=0;j<nums[i].length;j++){
        html+="<td>";
        html+=nums[i][j];
        html+="</td>";
      }
      html+="</tr>";
    }
    return html+"</table>";
  }
}
