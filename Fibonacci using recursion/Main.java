import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int a=0,b=1;
    int i,c=0;
    for(i=1;i<n;i++)
    {
      c=a+b;
      a=b;
      b=c;
    }
    System.out.print(c);
  }
}