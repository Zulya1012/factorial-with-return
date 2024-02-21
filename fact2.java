public class fact2{
  public static void main(String[] arg){
    factorial(10);
    System.out.println(factorial(10));
  }
  public static int factorial(int x){
    if (x==1){
      return 10;
    }
    
  return x*factorial(x-1);
  
  
}
}