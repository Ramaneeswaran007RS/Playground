import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int i,fact=1;
    for(i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    System.out.print(fact);
  }
}