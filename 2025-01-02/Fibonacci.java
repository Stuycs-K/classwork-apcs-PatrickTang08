public class Fibonacci{
  public static void main(String[] args) {
    System.out.println(fib(47));
  }
  public static long fib(long n){
    if(n>1){
      return fib(n-1)+fib(n-2);
    }else return n;
  }
}
