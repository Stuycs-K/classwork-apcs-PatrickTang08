public class MyArrays{
  public static void main(String[] args){
    System.out.println(arrayToString(new int[]{1, 2, 3, 4, 5}));
    System.out.println(arrayToString(returnCopy(new int[]{1,2,3,4,5})));
    System.out.println(arrayToString(concatArray(new int[]{1,2,3,4,5}, new int[]{6,7,8})));
  }
  public static String arrayToString(int[] nums){
    String s="[";
    for(int i=0; i<nums.length;i++){
      s=s+nums[i];
      if(i<nums.length-1){
        s+=", ";
      }
    }
    return s+"]";
  }
  public static int[] returnCopy(int[]ary){
    int[] ans = new int[ary.length];
    for(int i=0; i<ary.length;i++){
      ans[i]=ary[i];
    }
    return ans;
  }
  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] result = new int[ary1.length+ary2.length];
    for(int i=0; i<ary1.length;i++){
      result[i]=ary1[i];
    }
    for(int i=0; i<ary2.length;i++){
      result[i+ary1.length]=ary2[i];
    }
    return result;
  }
}
