import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int o=scan.nextInt();
    for(int i=n;i>0;i--)
    {
      if((n%i==0)&&(o%i==0))
      {
        System.out.print(i);
        break;
      }
    }
  }
}