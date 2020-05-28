import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int a,sum=0;
    while(n!=0)
    {
      a=n%10;
      sum=sum+a;
      n=n/10;
    }
    System.out.print(sum);
  }
}