//1. Patrick Tang: patrickt74@nycstudents.net    Bogdan Sotnikov: bogdans2789@nycstudents.net
public class ArrayMethods{
  public static void main(String[]args){
    System.out.println("2d arrToString test:");
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 64}, {2}}));
    System.out.println(arrToString(new int[][] {{2, 43, 4}, {}, {}}));
    System.out.println(arrToString(new int[][] {{}, {}, {}}));
    System.out.println(arrToString(new int[][] {{12, -312, 4}, {-5, -6}}));
    System.out.println(arrToString(new int[][] {{2, 3, 4}, {5, 6}, {-2}, {}, {0, -2, 3}}));

    System.out.println("2d arr2Dsum test:");
    System.out.println(arr2DSum(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 49, 9}}));
    System.out.println(arr2DSum(new int[][] {{21, 35, 4}, {5, 6}, {2}}));
    System.out.println(arr2DSum(new int[][] {{2, 3, 4}, {}, {}}));
    System.out.println(arr2DSum(new int[][] {{}, {}, {}}));
    System.out.println(arr2DSum(new int[][] {{2, -39, 4}, {-5, -62}}));
    System.out.println(arr2DSum(new int[][] {{20, 3, 4}, {5, 6}, {-2}, {}, {0, -2, 300}}));

    System.out.println("2d swapRC test:");
    System.out.println(arrToString(swapRC(new int[][] {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}})));
    System.out.println(arrToString(swapRC(new int[][] {{2, 3}, {5, 6}, {2, 4}})));
    System.out.println(arrToString(swapRC(new int[][] {{9, 8, 7, 6, 5, 4, 3, 2, 1}, {1, 2, 3, 4, 5, 6, 7, 8, 9}})));
    System.out.println(arrToString(swapRC(new int[][] {{1}, {6}})));
    System.out.println(arrToString(swapRC(new int[][] {{2, -3, 4}, {-5, -6, 20}})));
    System.out.println(arrToString(swapRC(new int[][] {{74}, {5}, {-2}, {-4}, {3}})));

    System.out.println("replaceNegative tests:");
    replaceNegative(new int[][] {{74}, {5}, {-2}, {-4}, {3}});
    replaceNegative(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    replaceNegative(new int[][] {{-1, 2, 53}, {64, -5, 20}, {7, 18, -9}});
    replaceNegative(new int[][] {{-1, 82, -3}, {-43, -5, 61}, {27, -8, 89}});
    replaceNegative(new int[][] {{-1}});
    replaceNegative(new int[][] {{9}});
    replaceNegative(new int[][] {{-1, -26, -3, 74, 95}});
    replaceNegative(new int[][] {{-1}, {-12}, {-9}, {6}, {5}});
    replaceNegative(new int[][] {});
  }

  //2. Copy your arrToString method from before.
  public static String arrToString(int[] nums){
    String s="[";
    for(int i=0; i<nums.length;i++){
      s+=nums[i];
      if(i<nums.length-1){
        s+=", ";
      }
    }
    return s+"]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
    public static String arrToString(int[][] nums){
      String s="[";
      for(int i=0; i<nums.length;i++){
        s+=arrToString(nums[i]);
        if(i<nums.length-1){
          s+=", ";
        }
      }
      return s+"]";
    }
  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }

    return sum;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
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
    return null;//placeholder so it compiles
  }

}
