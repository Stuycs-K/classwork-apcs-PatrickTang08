public class Fibonacci{
  public static void main(String[] args) {
    makeWords(10,"","01");
  }
  public static int fib(int n){
    if(n>1){
      return fib(n-1)+fib(n-2);
    }else return n;
  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if(remainingLetters>0){
      for(int i=0;i<alphabet.length();i++){
        makeWords(remainingLetters-1,result+alphabet.substring(i,i+1),alphabet);
    }
    }else{
      System.out.println(result);
    }
  }
}
