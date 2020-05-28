import java.util.*;
public class Main
{
    static int fib1(int n)
    {
         if (n <= 1)
         {
           return n;
         }
           else
         {
           return fib1(n-1) + fib1(n-2);
          }
    }
    static int fib(int s)
       {
        return fib1(s + 1);
       }
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  System.out.print(fib(a));
}
}