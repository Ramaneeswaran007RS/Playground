import java.io.*;
import java.util.*;
public class Main
{
   static int fib(int b)
  {
     if(b==1)
     {
      return 1;
     }
     else
     {
      return b+(fib(b-1));
     }
   }
public static void main(String args[])
{
  int c=Integer.parseInt(args[0]);
  System.out.print(fib(c));
}
}  
