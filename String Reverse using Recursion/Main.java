import java.util.Scanner;
public class Main
{
   static char fib(String a,int b)
  {
     if(b==0)
     {
      return a.charAt(0);
     }
     else
     {
       System.out.print(a.charAt(b));
      return fib(a,b-1);
  }
   }
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
   int b=a.length();
   System.out.print(fib(a,b-1));
}}  