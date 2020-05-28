import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int o=scan.nextInt();
    int a,c=0;
    while(n!=0)
    {
      a=n%10;
      if(o==a)
      {
        c++;
      }
      n=n/10;
    }
    System.out.print(c);
  }
}