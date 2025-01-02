public class Fibonacci{
  public static void main(String[] args) {
    int num=Integer.parseInt(args[0]);
    System.out.println(fib(num));
  }
  public static int fib(int n){
    if(n>1){
      return fib(n-1)+fib(n-2);
    }else return n;
  }
}
